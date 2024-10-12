package com.greatorator.tolkienmobs.datagen;

import com.greatorator.tolkienmobs.datagen.helpers.TolkienLangHelper;
import com.greatorator.tolkienmobs.init.TolkienBlocks;
import com.greatorator.tolkienmobs.init.TolkienItems;
import net.minecraft.data.PackOutput;

import java.util.HashMap;
import java.util.Map;

public class TolkienLangProvider extends TolkienLangHelper {
    public static final Map<String, String> SUBTITLE_GENERATOR = new HashMap<>();

    public TolkienLangProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void addTranslations() {
        this.add("itemgroup.tolkienmobs.deco", "TolkienTweaks: Building Blocks");
            this.addItem(TolkienItems.CREBAIN_FEATHER, "Crebain Feather");
            this.addItem(TolkienItems.BIRD_FEATHER, "Bird Feather");
            this.addItem(TolkienItems.MUMAKIL_LEATHER, "Mumakil Leather");
            this.addItem(TolkienItems.MONSTER_FUR, "Monster Fur");
            this.addItem(TolkienItems.BOTTLE_FANCY, "Fancy Bottle");
            this.addItem(TolkienItems.FOOD_HONEY, "Honey Bottle");
            this.addItem(TolkienItems.MONSTER_FLESH, "Monster Flesh");
            this.addItem(TolkienItems.INSECT, "Frog Bait");
            this.addItem(TolkienItems.GOLDEN_INSECT, "Fancy Frog Bait");
            this.addItem(TolkienItems.TREE_ACORN, "Acorn");
            this.addItem(TolkienItems.GOLDEN_TREE_ACORN, "Golden Acorn");
            this.addItem(TolkienItems.GOLEM_STONE, "Golem Stone");
            this.addItem(TolkienItems.GOLEM_STONE_EARTH, "Golem Stone: §2Earth§r");
            this.addItem(TolkienItems.GOLEM_STONE_AIR, "Golem Stone: §eAir§r");
            this.addItem(TolkienItems.GOLEM_STONE_FIRE, "Golem Stone: §4Fire§r");
            this.addItem(TolkienItems.GOLEM_STONE_WATER, "Golem Stone: §9Water§r");
            this.addItemWithLore(TolkienItems.GOLEM_STONE_SUMMON.get(), "Golem Stone: §bMithril§r", "Ancient artifact to summon a Legendary Golem");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_BASE.get(), "Backpack Upgrade - Base", "Used to create backpack upgrades");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_SIZE.get(), "Backpack Upgrade - Size", "Increase the storage capacity of your backpack (Max-2)");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_FLUID.get(), "Backpack Upgrade - Fluid Storage", "Allows the carrying of 16 buckets of fluid (Max-1)");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_CRAFTING.get(), "Backpack Upgrade - Crafting", "Allows crating anywhere (Max-1)");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_SLEEPING.get(), "Backpack Upgrade - Sleeping Bag", "Carry around a sleeping bag (Max-1)");
            this.addItemWithLore(TolkienItems.ITEM_BACKPACK_UPGRADE_CAMPFIRE.get(), "Backpack Upgrade - Campfire", "Quick use campfire (Max-1)");
            this.addItem(TolkienItems.TEMPLATE_MITHRIL, "Template: Mithril");
            this.addItem(TolkienItems.TEMPLATE_MORGULIRON, "Template: Morgul Iron");
            this.addItem(TolkienItems.TEMPLATE_AMMOLITE, "Template: Ammolite");
        this.add("itemgroup.tolkienmobs.natural", "TolkienTweaks: Natural Blocks");
            this.addItem(TolkienItems.PIPEWEED_SEEDS, "Pipeweed Seeds");
            this.addItem(TolkienItems.PIPEWEED_ITEM, "Pipeweed");
            this.addFlowerBlock(TolkienBlocks.FLOWER_SIMBELMYNE.get(), "Simbelmyne", "simbelmyne");
            this.addFlowerBlock(TolkienBlocks.FLOWER_MIRKWOOD.get(), "Seregon", "mirkwood");
            this.addFlowerBlock(TolkienBlocks.FLOWER_ALFIRIN.get(), "Alfirin", "alfirin");
            this.addFlowerBlock(TolkienBlocks.FLOWER_ATHELAS.get(), "Kingsfoil", "athelas");
            this.addFlowerBlock(TolkienBlocks.FLOWER_NIPHREDIL.get(), "Niphredil", "niphredil");
            this.addFlowerBlock(TolkienBlocks.FLOWER_SWAMPMILKWEED.get(), "Gallows-weed", "swamp_milkweed");
            this.addFlowerBlock(TolkienBlocks.FLOWER_LILLYOFTHEVALLEY.get(), "Lilly of the Valley", "valley_lilly");
            this.addFlowerBlock(TolkienBlocks.FLOWER_ELANOR.get(), "Elanor", "elanor");
            this.addFlowerBlock(TolkienBlocks.FLOWER_AEGLOS.get(), "Snowthorn", "aeglos");
            this.addFlowerBlock(TolkienBlocks.FLOWER_LISSUIN.get(), "Lissuin", "lissuin");
            this.addFlowerBlock(TolkienBlocks.FLOWER_MALLOS.get(), "Mallos", "mallos");
            this.addFlowerBlock(TolkienBlocks.FLOWER_BRAMBLES.get(), "Brambles of Mordor", "brambles");
            this.addFlowerBlock(TolkienBlocks.MUSHROOM_BLOOM_DECAY.get(), "Bloom of Decay", "mushroom_bloom_decay");
            this.addFlowerBlock(TolkienBlocks.MUSHROOM_DECAY_BLOOM.get(), "Bloom of Decay", "mushroom_decay_bloom");
            this.addBlock(TolkienBlocks.BLOCK_DECAY_BLOOM, "Decay Bloom Block");
            this.addBlock(TolkienBlocks.LIGHTNINGBUG_BLOCK, "Lightning Bug");
            this.addBlock(TolkienBlocks.LOCUST_BLOCK, "Locust");
            this.addBlock(TolkienBlocks.BLOCK_HALLOWED, "Hallowed Earth");
            this.addBlock(TolkienBlocks.STONE_PATH, "Stone Path");
            this.addBlock(TolkienBlocks.WALL_DECAY_BLOOM, "Wall Mushroom - Decay Bloom");
            this.addBlock(TolkienBlocks.WALL_MUSHROOM_RED, "Wall Mushroom - Red");
            this.addBlock(TolkienBlocks.WALL_MUSHROOM_BROWN, "Wall Mushroom - Brown");
            this.addBlock(TolkienBlocks.LIVING_ROOTS, "Living Roots");
            this.addBlockWithLore(TolkienBlocks.PLACARD.get(), "Country Signs", "Shift right-click on sign to cycle types");
            this.addBlock(TolkienBlocks.ROCKPILE, "Rockpile");
            this.addBlock(TolkienBlocks.MOSS_PATCH, "Moss Patch");
            this.addBlock(TolkienBlocks.CLOVER_PATCH, "Clover Patch");
        this.add("itemgroup.tolkienmobs.food", "TolkienTweaks: Food & Drinks");
            this.addItem(TolkienItems.LEMBAS, "Lembas");
            this.addItem(TolkienItems.CRAM, "Cram");
            this.addItem(TolkienItems.HONEY_CAKE, "Honey Cake");
            this.addItem(TolkienItems.BRAMBLES_BERRY, "Brambles Berry");
            this.addItem(TolkienItems.MIRUVOR, "Miruvor");
            this.addItem(TolkienItems.GROG, "Grog");
            this.addItem(TolkienItems.DRINK_ELF_FLEETFOOT, "Blessing of the Elves");
            this.addItem(TolkienItems.DRINK_ELF_VITALITY, "Vitality");
            this.addItem(TolkienItems.DRINK_ERU_BLESSING, "Blessing of Eru Iluvatar");
            this.addItem(TolkienItems.DRINK_ENT_DRAUGHT, "Ent Draught");
            this.addItem(TolkienItems.DRINK_PERSONAL_BLACKSMITH, "Portable Blacksmith");
        this.add("itemgroup.tolkienmobs.quest", "TolkienTweaks: Basic Items");
            this.addItemWithLore(TolkienItems.ITEM_BERYL.get(), "§3Glorfindel's Beryl§r", "Magical gem loaned to you to help on your search");
            this.addItemWithLore(TolkienItems.ITEM_FORTRESSMAP.get(), "§3Fortress Plans§r", "Seemingly fragile, surprising it survived so long");
            this.addItemWithLore(TolkienItems.ITEM_WATCHERHEART.get(), "§5Stone Heart§r", "This heart has a disturbing and fearful energy");
            this.addItemWithLore(TolkienItems.ITEM_WATCHERHEART_CRACKED.get(), "§5Watcher's Heart§r", "This heart looks like it has seen better days");
            this.addItemWithLore(TolkienItems.ITEM_KEYSTONE.get(), "§3Key-Stone§r", "Almost forgotten, this is the \"Key\" to opening a secret entrance");
            this.addItemWithLore(TolkienItems.ITEM_DARKSADDLE.get(), "§9Black Steed's Bridle§r", "Taken from the corpse of an evil Horse");
            this.addItemWithLore(TolkienItems.ITEM_ARTIFACT.get(), "§6Lost Artifact§r", "This objects emits a dark aura");
            this.addItemWithLore(TolkienItems.ITEM_BLANKPAPER.get(), "§5Manuscript page§r", "Lost page from a manuscript");
            this.addItemWithLore(TolkienItems.ITEM_FANCYARMOR.get(), "§5Cromhes' Armour§r §2(Repaired)§r", "After repairs, Cromhes' armour looks amazing");
            this.addItemWithLore(TolkienItems.ITEM_FANCYCLOTH.get(), "§2Fine Cloth§r", "Finely woven cloth for decoration");
            this.addItemWithLore(TolkienItems.ITEM_FANCYHAMMER.get(), "§9Thror's Hammer§r", "A hammer especially designed for shaping mithril");
            this.addItemWithLore(TolkienItems.ITEM_FANCYHELM.get(), "Fancy Helm", "");
            this.addItemWithLore(TolkienItems.ITEM_FANCYKEY.get(), "§3Dungeon Key§r", "Key made by Elssuli from the items you collected");
            this.addItemWithLore(TolkienItems.ITEM_FANCYPICK.get(), "Fancy Pick", "");
            this.addItemWithLore(TolkienItems.ITEM_FANCYSHIELD.get(), "Fancy Shield", "");
            this.addItemWithLore(TolkienItems.ITEM_FANCYSHIELD2.get(), "§5Cromhes' Shield§r §2(Repaired)§r", "This shield hails from an unknown origin though it belongs to Cromhes");
            this.addItemWithLore(TolkienItems.ITEM_FANCYSWORD.get(), "§5Cromhes' Sword§r §2(Repaired)§r", "The smith has done an amazing job on this sword");
            this.addItemWithLore(TolkienItems.ITEM_FANCYSWORD2.get(), "§4Apostle§r", "Hope of Vengeance");
            this.addItemWithLore(TolkienItems.ITEM_LETTER.get(), "§6Thurdan's Letter§r", "Thurdan's letter about Dreulhara");
            this.addItemWithLore(TolkienItems.ITEM_SCROLL.get(), "§5Ashen Scroll§r", "A tattered scroll, covered in small runes");
            this.addItemWithLore(TolkienItems.ITEM_SCROLL2.get(), "§5Translated Scroll§r", "A scroll translated by Elrond with instructions to get into the dungeons of Moria");
            this.addItemWithLore(TolkienItems.ITEM_SPECIALFLOWER.get(), "§2Hag Hops§r", "Especially potent flower brewers love to use");
            this.addItemWithLore(TolkienItems.ITEM_STORYBOOK.get(), "§3Hobbit Story§r", "Story told by a hobbit after Bilbo disappeared on his birthday");
            this.addItemWithLore(TolkienItems.ITEM_STORYBOOK2.get(), "§6Bilbo's Story§r", "Gift Created by Gaffer Gamgee for Bilbo's Birthday");
            this.addItemWithLore(TolkienItems.ITEM_STORYBOOK3.get(), "§3Petunia's Manuscript§r", "Journal of the adventures a young Hobbit has");
            this.addItemWithLore(TolkienItems.ITEM_STORYBOOK4.get(), "§2Ancient Tome§r", "This book looks like it has seen better days");
            this.addItemWithLore(TolkienItems.ITEM_WORNARMOR.get(), "§5Cromhes' Armour§r", "Item stolen from Cromhes while he was held captive");
            this.addItemWithLore(TolkienItems.ITEM_WORNHELM.get(), "§5Broken Helm§r", "Item Thonrum wanted repaired");
            this.addItemWithLore(TolkienItems.ITEM_WORNKEY.get(), "§5Bandit's Key§r", "Ruined key found on the body of a bandit captain");
            this.addItemWithLore(TolkienItems.ITEM_WORNPICK.get(), "§5Worn-out Pickaxe§r", "Item Thonrum wanted repaired");
            this.addItemWithLore(TolkienItems.ITEM_WORNSHIELD.get(), "§5Damaged Shield§r", "Item Thonrum wanted repaired");
            this.addItemWithLore(TolkienItems.ITEM_WORNSHIELD2.get(), "§5Cromhes' Shield§r", "Item stolen from Cromhes while he was held captive");
            this.addItemWithLore(TolkienItems.ITEM_WORNSWORD.get(), "§5Cromhes' Sword§r", "Item stolen from Cromhes while he was held captive");
            this.addItemWithLore(TolkienItems.ITEM_WOVENBASKET.get(), "§2Woven Basket§r", "Basket woven to pay tribute");
            this.addItemWithLore(TolkienItems.ITEM_WRITTENPAPER.get(), "§5Statue Rubbing§r", "Charcoal rubbing of the runes on the Watchers near Khazad-dum");
            this.addItemWithLore(TolkienItems.ITEM_PUNGENTHERB.get(), "§4Pungent Herb§r", "Herb used in powerful potions");
            this.addItemWithLore(TolkienItems.ITEM_LOCKPICK.get(), "Lock-Pick", "Item used to open doors");
            this.addItemWithLore(TolkienItems.ITEM_BROKENSWORD.get(), "§5Sword Hilt§r", "All that was left of the Dwarven sword");
            this.addItemWithLore(TolkienItems.ITEM_REFORGEDSWORD.get(), "Reforged Sword", "Remarkably good Dwarven work");
            this.addItemWithLore(TolkienItems.ITEM_MAGIC_CLOTH.get(), "§5Special Magic Cloth§r", "Fine Elven cloth made into a bag");
            this.addItemWithLore(TolkienItems.ITEM_KEYFRAGMENT.get(), "Key Fragment", "");
            this.addItemWithLore(TolkienItems.ITEM_OILYKEY.get(), "Oil-covered Key", "");
            this.addItemWithLore(TolkienItems.ITEM_MITHRILNUGGET.get(), "§5Bilbo's Nugget§r", "Token Bilbo took from his adventures in the Lonely Mountain");
            this.addItemWithLore(TolkienItems.ITEM_REMAINS.get(), "§2Pile of Bones§r", "Remains of some poor unfortunate soul");
            this.addItemWithLore(TolkienItems.ITEM_RUNE_STONE.get(), "§2Ancient Rune Stone§r", "This stone houses very powerful dark magic");
            this.addItemWithLore(TolkienItems.ITEM_COIN_BRONZE.get(), "Bronze Coin", "64 Can be traded for 1 Silver coin");
            this.addItemWithLore(TolkienItems.ITEM_COIN_SILVER.get(), "Silver Coin", "64 Can be traded for 1 Gold coin");
            this.addItemWithLore(TolkienItems.ITEM_COIN_GOLD.get(), "Gold Coin", "64 Can be traded for 1 Mithril coin");
            this.addItemWithLore(TolkienItems.ITEM_COIN_MITHRIL.get(), "Mithril Coin", "Very rare and valuable coin");
            this.addItemWithLore(TolkienItems.ITEM_DARKSIGIL.get(), "§5Dark Sigil§r", "Dark symbol dropped by a minion");
            this.addItemWithLore(TolkienItems.ITEM_FACTIONCOIN.get(), "§3Faction Coin§r", "This can be traded for unique items");
            this.addItemWithLore(TolkienItems.ITEM_FACTIONTOKEN.get(), "§9Faction Token§r", "Use this to raise faction standing");
            this.addItemWithLore(TolkienItems.ITEM_CAVECOMPLETE.get(), "§3Cave completion Token§r", "Proof of killing the troll");
            this.addItemWithLore(TolkienItems.ITEM_WATCHERCOMPLETE.get(), "§3Watcher Token§r", "Proof of defeating the Watcher");
            this.addItemWithLore(TolkienItems.ITEM_TOKEN_EASTERN_ALLIANCE.get(), "§4Eastern Alliance Token§r", "Proof of your decision of who you chose to align with");
            this.addItemWithLore(TolkienItems.ITEM_TOKEN_WESTERN_ALLIANCE.get(), "§1Western Alliance Token§r", "Proof of your decision of who you chose to align with");
            this.addItemWithInstructions(TolkienItems.BRONZE_KEY.get(), "Bronze Key", "Uses Left: ", "Hold Shift while in Creative", "Right-click to enter/change key code");
            this.addItemWithInstructions(TolkienItems.SILVER_KEY.get(), "Silver Key", "Uses Left: ", "Hold Shift while in Creative", "Right-click to enter/change key code");
            this.addItemWithInstructions(TolkienItems.GOLD_KEY.get(), "Gold Key", "Uses Left: ", "Hold Shift while in Creative", "Right-click to enter/change key code");
            this.addItemWithInstructions(TolkienItems.MITHRIL_KEY.get(), "Mithril Key", "Uses Left: ", "Hold Shift while in Creative", "Right-click to enter/change key code");
            this.addItemWithInstructions(TolkienItems.MASTER_KEY.get(), "Master Key", "Uses Left: ", "Hold Shift while in Creative", "Right-click to enter/change key code");
        this.add("itemgroup.tolkienmobs.spawn", "TolkienTweaks: Mobs");
        this.add("itemgroup.tolkienmobs.trinket", "TolkienTweaks: Trinkets");
            this.createTrinketSet("ring", "Ring");
            this.createTrinketSet("amulet", "Amulet");
            this.createTrinketSet("charm", "Charm");
            this.createTrinketSet("belt", "Belt");
            this.createTrinketSet("glove", "Glove");
            this.createTrinketSet("hat", "Hat");
            this.createTrinketSet("cloak", "Cloak");
        this.add("itemgroup.tolkienmobs.tools", "TolkienTweaks: Tools");
            this.addItem(TolkienItems.COIN_POUCH, "Coin Pouch");
            this.addItem(TolkienItems.KEY_RING, "Key Ring");
            this.addItemWithLore(TolkienItems.ITEM_DEV_TOOL.get(), "Dev Tool", "Use to temporarily reset camo blocks to default texture");
            this.addItemWithLore(TolkienItems.HOBBIT_RING.get(), "Hobbit Ring of Growth", "Gift from the elves to enhance farming");
            this.addItemWithLore(TolkienItems.SWORD_WITCHKING.get(), "§4Sword of the Witch-king§r", "Forged in fear, the powerful weapon of the Witch-king");
            this.addItemWithLore(TolkienItems.SWORD_URUK.get(), "Uruk Sword", "Forged in fire beneath Isengard");
            this.addItemWithLore(TolkienItems.WHIP_FIRE.get(), "§4Whip of Fire§r","Primary weapon of the fearsome Balrog");
            this.addItemWithLore(TolkienItems.CLUB_WOODEN.get(), "Troll Club", "Deadly weapon favoured by Trolls");
            this.addTools("mithril", "Mithril");
            this.addTools("morguliron", "Morgul Iron");
            this.addTools("ammolite", "Ammolite");
            this.addItem(TolkienItems.DWARVEN_HAMMER, "Dwarven Mining Hammer");
            this.addItem(TolkienItems.HYPE_HORN, "Hype Horn");
            this.addItem(TolkienItems.HELMET_MITHRIL, "Mithril Helmet");
            this.addItem(TolkienItems.CHESTPLATE_MITHRIL, "Mithril Chestplate");
            this.addItem(TolkienItems.LEGGINGS_MITHRIL, "Mithril Leggings");
            this.addItem(TolkienItems.BOOTS_MITHRIL, "Mithril Boots");
            this.addItem(TolkienItems.MITHRIL_HORSE_ARMOR, "Mithril Horse Armor");
            this.addItem(TolkienItems.HELMET_MORGULIRON, "Morgul Iron Helmet");
            this.addItem(TolkienItems.CHESTPLATE_MORGULIRON, "Morgul Iron Chestplate");
            this.addItem(TolkienItems.LEGGINGS_MORGULIRON, "Morgul Iron Leggings");
            this.addItem(TolkienItems.BOOTS_MORGULIRON, "Morgul Iron Boots");
            this.addItem(TolkienItems.MORGULIRON_HORSE_ARMOR, "Morguliron Horse Armor");
            this.addItem(TolkienItems.HELMET_AMMOLITE, "Ammolite Helmet");
            this.addItem(TolkienItems.CHESTPLATE_AMMOLITE, "Ammolite Chestplate");
            this.addItem(TolkienItems.LEGGINGS_AMMOLITE, "Ammolite Leggings");
            this.addItem(TolkienItems.BOOTS_AMMOLITE, "Ammolite Boots");
            this.addItem(TolkienItems.AMMOLITE_HORSE_ARMOR, "Ammolite Horse Armor");
            this.addItem(TolkienItems.ELVEN_BOW, "Elven Bow");
            this.addItem(TolkienItems.URUK_BOW, "Uruk Bow");
            this.addMusicDisc(TolkienItems.RECORD_EREBOR, "SnowShepherd - All That Glitters in Erebor");
            this.addMusicDisc(TolkienItems.RECORD_HOBBITS, "Harry Murrell - Concerning Hobbits");
            this.addMusicDisc(TolkienItems.RECORD_MINASTIRITH, "SnowShepherd - Grandeur of Minas Tirith");
            this.addMusicDisc(TolkienItems.RECORD_MURDERFROG, "SnowShepherd - Battle of Murder Frog");
            this.addMusicDisc(TolkienItems.RECORD_BOMBADIL, "SnowShepherd - Whimsy of Bombadil");
            this.addMusicDisc(TolkienItems.RECORD_REDER, "SnowShepherd - Reder's Revenge");
            this.addMusicDisc(TolkienItems.RECORD_RIVENDELL, "SnowShepherd - Riders of Rivendell");
            this.addMusicDisc(TolkienItems.RECORD_LOTHLORIEN, "SnowShepherd - The Light of Lothlorien");
            this.addMusicDisc(TolkienItems.RECORD_WILLOW, "SnowShepherd - For a Bit of Shade");
            this.addMusicDisc(TolkienItems.RECORD_FUMBLE, "SnowShepherd - Bumbling Troll");
            this.addMusicDisc(TolkienItems.RECORD_EDORAS, "SnowShepherd - Home of the Horse-lords");
            this.addMusicDisc(TolkienItems.RECORD_WBATTLE, "SnowShepherd - Ephalba's Realm");
        this.add("itemgroup.tolkienmobs.mats", "TolkienTweaks: Ingredients");
        this.add("itemgroup.tolkienmobs.function", "TolkienTweaks: Functional Blocks");
            this.addBlock(TolkienBlocks.TRINKET_TABLE, "Trinket Table");
            this.add(TolkienBlocks.FIREPLACE.get(), "Fireplace");
            this.add(TolkienBlocks.PIGGYBANK.get(), "Piggy Bank");
            this.add(TolkienBlocks.BACKPACK.get(), "Adventurer's Backpack");
            this.add(TolkienBlocks.CHAMELEON_BLOCK.get(), "Chameleon Block");
            this.add(TolkienBlocks.KEY_STONE_BLOCK.get(), "Camouflage Key Stone");
            this.add(TolkienBlocks.CAMO_GLOWSTONE_BLOCK.get(), "Camouflage Glowstone");
            this.add(TolkienBlocks.CAMO_SMOKER_BLOCK.get(), "Camouflage Smoker");
            this.addBlockWithLore(TolkienBlocks.CAMO_FLUID_BLOCK.get(), "Camouflage Fluid Source", "Right-click with bucket to set fluid");
            this.add(TolkienBlocks.CAMO_CHEST_BLOCK.get(), "Camouflage Chest");
            this.add(TolkienBlocks.CAMO_SPAWNER_BLOCK.get(), "Camouflage Spawner");
            this.add(TolkienBlocks.MILESTONE_BLOCK.get(), "Fast-travel Milestone");
            this.add(TolkienBlocks.WELL.get(), "Water Well");
            this.add(TolkienBlocks.LOCKABLE_CHEST_BLOCK.get(), "Lockable Chest");
            this.add(TolkienBlocks.LOCKABLE_TREASURE_CHEST_BLOCK.get(), "Lockable Treasure Chest");
            this.add(TolkienBlocks.LOCKABLE_DOUBLE_CHEST_BLOCK.get(), "Lockable Double Chest");
            this.add(TolkienBlocks.LOCKABLE_DOUBLE_TREASURE_CHEST_BLOCK.get(), "Lockable Double Treasure Chest");
            this.addBlock(TolkienBlocks.SILMARIL_LANTERN, "Light of Elendil");
            this.addBlock(TolkienBlocks.ELVEN_LANTERN, "Elven Lantern");
            this.addBlock(TolkienBlocks.MORGUL_LANTERN, "Morgul Lantern");
            this.addBlock(TolkienBlocks.TORCH_MALLORN, "Mallorn Torch");
            this.addBlock(TolkienBlocks.TORCH_MIRKWOOD, "Mirkwood Torch");
            this.addBlock(TolkienBlocks.TORCH_CULUMALDA, "Culumalda Torch");
            this.addBlock(TolkienBlocks.TORCH_LEBETHRON, "Lebethron Torch");
            this.addBlock(TolkienBlocks.TORCH_FANGORNOAK, "Fangorn Oak Torch");
            this.addBlock(TolkienBlocks.TORCH_DEADWOOD, "Deadwood Torch");
            this.addBlock(TolkienBlocks.TORCH_DWARVEN_MAPLE, "Dwarven Maple Torch");

            this.createWoodSet("mallorn", "Mallorn");
            this.createWoodSet("mirkwood", "Mirkwood");
            this.createWoodSet("culumalda", "Culumalda");
            this.createWoodSet("lebethron", "Lebethron");
            this.createWoodSet("fangornoak", "Fangorn Oak");
            this.createWoodSet("deadwood", "Dead Wood");
            this.createWoodSet("dwarven_maple", "Dwarven Maple");
            this.createMetalSet("mithril", "Mithril");
            this.createMetalSet("morguliron", "Morgul Iron");

            this.createStoneSet("dwarven_stone", "Dwarven Stone");
            this.createStoneSet("chiseled_dwarven_stone_bricks", "Chiseled Dwarven Stone Bricks");
            this.createStoneSet("cobbled_dwarven_stone", "Cobbled Dwarven Stone");
            this.createStoneSet("cracked_dwarven_stone_bricks", "Cracked Dwarven Stone");
            this.createStoneSet("dwarven_stone_bricks", "Dwarven Stone Bricks");
            this.createStoneSet("smooth_dwarven_stone", "Smooth Dwarven Stone");
            this.createStoneSet("elven_marble", "Elven Marble");
            this.createStoneSet("chiseled_elven_marble_bricks", "Chiseled Elven Marble Bricks");
            this.createStoneSet("cobbled_elven_marble", "Cobbled Elven Marble");
            this.createStoneSet("cracked_elven_marble_bricks", "Cracked Elven Marble");
            this.createStoneSet("elven_marble_bricks", "Elven Marble Bricks");
            this.createStoneSet("smooth_elven_marble", "Smooth Elven Marble");
            this.createStoneSet("mountain_stone", "Mountain Stone");
            this.createStoneSet("chiseled_mountain_stone_bricks", "Chiseled Mountain Stone Bricks");
            this.createStoneSet("cobbled_mountain_stone", "Cobbled Mountain Stone");
            this.createStoneSet("cracked_mountain_stone_bricks", "Cracked Mountain Stone");
            this.createStoneSet("mountain_stone_bricks", "Mountain Stone Bricks");
            this.createStoneSet("smooth_mountain_stone", "Smooth Mountain Stone");

            this.createGemSet("ammolite", "Ammolite");

            this.addBlock(TolkienBlocks.DOOR_DURIN, "Door of Durin");

            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_BLUE.get(), "Blue Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_RED.get(), "Red Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_BLACK.get(), "Black Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_BROWN.get(), "Brown Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_CYAN.get(), "Cyan Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_GRAY.get(), "Gray Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_GREEN.get(), "Green Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_LIGHT_BLUE.get(), "Light Blue Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_LIGHT_GRAY.get(), "Light Gray Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_LIME.get(), "Lime Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_MAGENTA.get(), "Magenta Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_ORANGE.get(), "Orange Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_PINK.get(), "Pink Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_PURPLE.get(), "Purple Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_WHITE.get(), "White Sleeping Bag", "§cDoes not§r reset spawn point.");
            this.addBlockWithLore(TolkienBlocks.SLEEPING_BAG_YELLOW.get(), "Yellow Sleeping Bag", "§cDoes not§r reset spawn point.");

                // Screens
            this.addItemScreen(TolkienItems.BRONZE_KEY.get(), "Bronze Key");
            this.addCodeScreen(TolkienItems.BRONZE_KEY.get(), "Bronze Key - Code");
            this.addItemScreen(TolkienItems.SILVER_KEY.get(), "Silver Key");
            this.addCodeScreen(TolkienItems.SILVER_KEY.get(), "Silver Key - Code");
            this.addItemScreen(TolkienItems.GOLD_KEY.get(), "Gold Key");
            this.addCodeScreen(TolkienItems.GOLD_KEY.get(), "Gold Key - Code");
            this.addItemScreen(TolkienItems.MITHRIL_KEY.get(), "Mithril Key");
            this.addCodeScreen(TolkienItems.MITHRIL_KEY.get(), "Mithril Key - Code");
            this.addItemScreen(TolkienItems.MASTER_KEY.get(), "Master Key");
            this.addCodeScreen(TolkienItems.MASTER_KEY.get(), "Master Key - Code");
            this.addItemScreen(TolkienItems.COIN_POUCH.get(), "Coin Pouch");
            this.addBlockScreen(TolkienBlocks.TRINKET_TABLE.get(), "Trinket Crafting");
            this.addBlockScreen(TolkienBlocks.FIREPLACE.get(), "Fireplace");
            this.addBlockScreen(TolkienBlocks.PIGGYBANK.get(), "Piggy Bank");
            this.addBlockScreen(TolkienBlocks.BACKPACK.get(), "Adventurer's Backpack");
            this.add("screen.tolkienmobs.namefieldtext", "Enter Code");
            this.add("screen.tolkienmobs.keycodeplaceholder", "No Code Found");
            this.add("screen.tolkienmobs.keyuses", "-1");

                // Buttons
            this.add("buttons.tolkienmobs.saveinfo", "Save Info");

                // General Messages
            this.add("tolkienmobs.msg.wrong_key", "You need the correct key!");

                // Potions & Effects
                    // Beneficial
            this.createPotionSet("personal_blacksmith", "Portable Blacksmith");
            this.createPotionSet("ent_draught", "Ent Draught");
            this.createPotionSet("blessing_of_eru", "Eru's Blessing");
            this.createPotionSet("elf_vitality", "Elvish Life-span");
            this.createPotionSet("elven_nimbleness", "Elvish Nimbleness");
                // Harmful
            this.createPotionSet("elemental_flight", "Elemental Flying");
            this.createPotionSet("elemental_drowning", "Elemental Drowning");
            this.createPotionSet("elemental_lightning", "Elemental Lightning");
            this.createPotionSet("elemental_burning", "Elemental Burning");
            this.createPotionSet("sleepnesia", "Sleepnesia");
            this.createPotionSet("inventory_corrosion", "Corrosion");
            this.createPotionSet("dread_aura", "Great Dread");
            this.createPotionSet("crippling_terror", "Paralysing Fear");

                // Sounds
            this.addSound("block", "chest_open", "Chest has opened");
            this.addSound("block", "chest_close", "Chest has closed");
            this.addSound("block", "cathedralbell", "A bell in ringing");
            this.addSound("block", "locust_ambient", "Buzzing Locusts");
            this.addSound("block", "lightningbug_ambient", "Lightning bugs chirping");
            this.addSound("ambient", "medievalseaport", "Sounds of the sea");
            this.addSound("ambient", "medievaltavern", "Tavern patrons chattering");
            this.addSound("ambient", "medievalcitymarket", "People moving around buying in the market");
            this.addSound("ambient", "medievalcity", "Bustling sounds of the city");
            this.addSound("ambient", "waterworks", "Ancient cave of machinery");
            this.addSound("ambient", "underworld", "Creepy cavern underground");
            this.addSound("ambient", "khazaddum", "Sounds of an ancient Dwarven City");
            this.addSound("ambient", "pathsofthedead", "The way is shut, and the dead keep it");
            this.addSound("ambient", "arda_portal", "Portal to Arda beckons");
            this.addSound("item", "hype_horn", "Celebrating victory");
            this.addSound("mob", "coin_trader", "A Wild Coin Trader appears!");

                // Entities
                    // Villager
            this.add("entity.minecraft.villager.tolkienmobs.coin_trader", "Coin Trader");
            this.add("entity.minecraft.villager.tolkienmobs.grocery_store", "Grocery Store");
            this.add("entity.minecraft.villager.tolkienmobs.pet_merchant", "Junk Trader");
            this.add("entity.minecraft.villager.tolkienmobs.junk_trader", "Pet Merchant");
            this.add("entity.minecraft.villager.tolkienmobs.trinket_smith", "Magical Armourer");
            this.add("entity.minecraft.villager.tolkienmobs.trinket_tailor", "Magical Tailor");

                // Enchantments
            this.add("enchantment.tolkienmobs.balrog_mark_key", "Balrog's Mark");
    }
}
