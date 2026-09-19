package com.dragn0007.thatsjustpeachy.blocks;

import com.dragn0007.dragncrops.blocks.crop.base.FruitLeaves;
import com.dragn0007.dragncrops.blocks.custom.food.*;
import com.dragn0007.dragncrops.blocks.pixel_placement.util.PixelPlacer;
import com.dragn0007.dragncrops.util.COTags;
import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.blocks.custom.*;
import com.dragn0007.thatsjustpeachy.items.TJPItems;
import com.dragn0007.thatsjustpeachy.spawn.tree.PeachTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class TJPBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThatsJustPeachy.MODID);
   
    public record WoodType(
            RegistryObject<FlammableRotatedPillarBlock> log,
            RegistryObject<FlammableRotatedPillarBlock> stripped_log,
            RegistryObject<FlammableRotatedPillarBlock> wood,
            RegistryObject<FlammableRotatedPillarBlock> stripped_wood,
            RegistryObject<Block> planks,
            RegistryObject<Block> stairs,
            RegistryObject<Block> slab,
            RegistryObject<Block> fence,
            RegistryObject<Block> fenceGate,
            RegistryObject<Block> door,
            RegistryObject<Block> trapdoor
    ) {}

    public static final RegistryObject<FlammableRotatedPillarBlock> PEACH_LOG = registerBlock("peach_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<FlammableRotatedPillarBlock> STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<FlammableRotatedPillarBlock> PEACH_WOOD = registerBlock("peach_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<FlammableRotatedPillarBlock> STRIPPED_PEACH_WOOD = registerBlock("stripped_peach_wood",
            () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> PEACH_PLANKS = registerBlock("peach_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEACH_LEAVES = registerBlock("peach_leaves",
            () -> new PeachLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> PEACH_STAIRS = registerBlock("peach_stairs",
            () -> new StairBlock(PEACH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEACH_SLAB = registerBlock("peach_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> PEACH_SAPLING = registerBlock("peach_sapling",
            () -> new SaplingBlock(new PeachTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PEACH_FENCE = registerBlock("peach_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEACH_FENCE_GATE = registerBlock("peach_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(OAK_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> PEACH_DOOR = registerBlock("peach_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> PEACH_TRAPDOOR = registerBlock("peach_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Map<Woods, RegistryObject<DoorBlock>> DOORS = new EnumMap<>(Woods.class);
    public static final Map<Woods, RegistryObject<Item>> DOOR_ITEMS = new EnumMap<>(Woods.class);
    static {
        for (Woods color : Woods.values()) {
            String blockName = color.name().toLowerCase() + "_peach_door";
            RegistryObject<DoorBlock> block = BLOCKS.register(blockName,
                    () -> new DoorBlock(BlockBehaviour.Properties.copy(OAK_DOOR), BlockSetType.OAK));
            RegistryObject<Item> blockItem = TJPItems.ITEMS.register(blockName,
                    () -> new BlockItem(block.get(), new Item.Properties()));
            DOORS.put(color, block);
            DOOR_ITEMS.put(color, blockItem);
        }
    }

    public static WoodType PEACH = new WoodType(
            TJPBlocks.PEACH_LOG, TJPBlocks.STRIPPED_PEACH_LOG, TJPBlocks.PEACH_WOOD, TJPBlocks.STRIPPED_PEACH_WOOD,
            TJPBlocks.PEACH_PLANKS, TJPBlocks.PEACH_STAIRS, TJPBlocks.PEACH_SLAB,
            TJPBlocks.PEACH_FENCE, TJPBlocks.PEACH_FENCE_GATE, TJPBlocks.PEACH_DOOR, TJPBlocks.PEACH_TRAPDOOR
    );

    public static final RegistryObject<PaperLantern> PEACH_PAPER_LANTERN = registerBlock("peach_paper_lantern", PaperLantern::new);
    public static final RegistryObject<PeachLantern> PEACH_LANTERN = registerBlock("peach_lantern", PeachLantern::new);

    public static final Map<DyeColor, RegistryObject<PaperLantern>> PAPER_LANTERNS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, RegistryObject<Item>> PAPER_LANTERN_ITEMS = new EnumMap<>(DyeColor.class);
    static {
        for (DyeColor color : DyeColor.values()) {
            String blockName = color.getName() + "_peach_paper_lantern";
            RegistryObject<PaperLantern> block = BLOCKS.register(blockName, PaperLantern::new);
            RegistryObject<Item> blockItem = TJPItems.ITEMS.register(blockName,
                    () -> new BlockItem(block.get(), new Item.Properties()));
            PAPER_LANTERNS.put(color, block);
            PAPER_LANTERN_ITEMS.put(color, blockItem);
        }
    }

    public static final Map<DyeColor, RegistryObject<PeachLantern>> PEACH_LANTERNS = new EnumMap<>(DyeColor.class);
    public static final Map<DyeColor, RegistryObject<Item>> PEACH_LANTERN_ITEMS = new EnumMap<>(DyeColor.class);
    static {
        for (DyeColor color : DyeColor.values()) {
            String blockName = color.getName() + "_peach_lantern";
            RegistryObject<PeachLantern> block = BLOCKS.register(blockName, PeachLantern::new);
            RegistryObject<Item> blockItem = TJPItems.ITEMS.register(blockName,
                    () -> new BlockItem(block.get(), new Item.Properties()));
            PEACH_LANTERNS.put(color, block);
            PEACH_LANTERN_ITEMS.put(color, blockItem);
        }
    }

    public static final RegistryObject<Block> PEACH_JAM = registerBlockWithoutItem("peach_jam", JamJarBlock::new);
    public static final RegistryObject<TartBlock> PEACH_TART = registerPixelPlacerWithoutItem("peach_tart", TartBlock::new);
    public static final RegistryObject<Block> PEACH_CANDY = registerBlockWithoutItem("peach_candy", CandyBlock::new);
    public static final RegistryObject<Block> UNFERMENTED_PEACH_MEAD = registerBlockWithoutItem("unfermented_peach_mead", UnfermentedPeachMead::new);
    public static final RegistryObject<Block> FERMENTED_PEACH_MEAD = registerBlockWithoutItem("fermented_peach_mead", MeadJarBlock::new);
    public static final RegistryObject<Block> PEACH_MEAD = registerBlockWithoutItem("peach_mead", MeadBottleBlock::new);
    public static final RegistryObject<Block> PEACH_GELATIN = registerBlockWithoutItem("peach_gelatin", GelatinBlock::new);

    public enum Woods {
        ACACIA,
        BAMBOO,
        BIRCH,
        CHERRY,
        CRIMSON,
        DARK_OAK,
        JUNGLE,
        MANGROVE,
        OAK,
        SPRUCE,
        WARPED;
        Woods() {}
    }

    protected static <T extends PixelPlacer>RegistryObject<T> registerPixelPlacerWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    
    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        TJPItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static <T extends Block>RegistryObject<T> registerWaterBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerWaterBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerWaterBlockItem(String name, RegistryObject<T> block) {
        TJPItems.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
