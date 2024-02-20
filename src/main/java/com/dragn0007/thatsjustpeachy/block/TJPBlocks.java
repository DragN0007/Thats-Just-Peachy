package com.dragn0007.thatsjustpeachy.block;

import com.dragn0007.thatsjustpeachy.ThatsJustPeachy;
import com.dragn0007.thatsjustpeachy.block.custom.PeachLeaves;
import com.dragn0007.thatsjustpeachy.block.custom.TJPStrippableLog;
import com.dragn0007.thatsjustpeachy.block.custom.vox.PaperLanternVox;
import com.dragn0007.thatsjustpeachy.block.custom.vox.PeachLanternVox;
import com.dragn0007.thatsjustpeachy.item.TJPItemGroup;
import com.dragn0007.thatsjustpeachy.item.TJPItems;
import com.dragn0007.thatsjustpeachy.world.feature.tree.PeachTreeGrower;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.OAK_PLANKS;

public class TJPBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, ThatsJustPeachy.MODID);


    //Cake
    public static final RegistryObject<Block> PEACH_CAKE = registerBlockWithoutItem("peach_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL)));

    //Decor
    public static final RegistryObject<PaperLanternVox> PAPER_LANTERN = registerBlock("paper_lantern",
            () -> new PaperLanternVox());
    public static final RegistryObject<PeachLanternVox> PEACH_LANTERN = registerBlock("peach_lantern",
            () -> new PeachLanternVox());

    //Tree
    public static final RegistryObject<Block> PEACH_LOG = registerBlock("peach_log",
            () -> log(MaterialColor.NONE, MaterialColor.NONE));
    public static final RegistryObject<Block> STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            () -> log(MaterialColor.NONE, MaterialColor.NONE));
    public static final RegistryObject<Block> PEACH_PLANKS = registerBlock("peach_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> PEACH_WALL = registerBlock("peach_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(PEACH_PLANKS.get())));
    public static final RegistryObject<Block> PEACH_LEAVES = registerBlock("peach_leaves",
            () -> new PeachLeaves(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> PEACH_SAPLING = registerBlockWithoutItem("peach_sapling",
            () -> new SaplingBlock(new PeachTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> PEACH_STAIRS = registerBlock("peach_stairs",
            () -> new StairBlock(PEACH_PLANKS.get().defaultBlockState(), Block.Properties.copy(OAK_PLANKS)));
    public static final RegistryObject<Block> PEACH_SLAB = registerBlock("peach_slab",
            () -> new SlabBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> PEACH_DOOR = registerBlock("peach_door",
            () -> new DoorBlock(Block.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> PEACH_TRAPDOOR = registerBlock("peach_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> PEACH_FENCE = registerBlock("peach_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD) .strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PEACH_FENCE_GATE = registerBlock("peach_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PEACH_WALL_LINER = registerBlock("peach_wall_liner",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));


    private static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        TJPItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(TJPItemGroup.GROUP)));
    }

    private static TJPStrippableLog log(MaterialColor p_50789_, MaterialColor p_50790_) {
        return new TJPStrippableLog(BlockBehaviour.Properties.of(Material.WOOD, (p_152624_) -> {
            return p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? p_50789_ : p_50790_;
        }).strength(2.0F).sound(SoundType.WOOD));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
