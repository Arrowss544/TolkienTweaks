package com.greatorator.tolkienmobs.block.custom.entity;

import com.greatorator.tolkienmobs.containers.LockableChestContainer;
import com.greatorator.tolkienmobs.init.TolkienBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class LockableChestBlockEntity extends BlockEntity implements MenuProvider {
    public LockableChestBlockEntity(BlockPos pos, BlockState blockState) {
        super(TolkienBlocks.LOCKABLE_CHEST_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("screen.tolkienmobs.block.tolkienmobs.lockable_chest_block");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new LockableChestContainer(pContainerId, pPlayerInventory, this);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider pRegistries) {
        return saveWithoutMetadata(pRegistries);
    }

//    @Override
//    protected void saveAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
//        pTag.put("inventory", itemHandler.serializeNBT(pRegistries));
//        pTag.putInt("progress", progress);
//        pTag.putInt("max_progress", maxProgress);
//
//        super.saveAdditional(pTag, pRegistries);
//    }
//
//    @Override
//    protected void loadAdditional(CompoundTag pTag, HolderLookup.Provider pRegistries) {
//        super.loadAdditional(pTag, pRegistries);
//        itemHandler.deserializeNBT(pRegistries, pTag.getCompound("inventory"));
//        progress = pTag.getInt("progress");
//        maxProgress = pTag.getInt("max_progress");
//    }
}
