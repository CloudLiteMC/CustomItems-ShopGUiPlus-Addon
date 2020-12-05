package net.cloudlite.plugin;

import com.jojodmo.customitems.api.CustomItemsAPI;
import net.brcdev.shopgui.provider.item.ItemProvider;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CustomItemProvider extends ItemProvider {

    public CustomItemProvider(@Nonnull final PluginAddon plugin) {
        super("custom_items_provider");
    }

    @Override
    /*
     * This will be the item check to see if it is a valid ItemStack of your providing plugin
     * This may vary but it will likely have something to do with checking a NBT tag or other meta
     * Check to see if it is an actual item that your ItemProvider
     */
    public boolean isValidItem(ItemStack itemStack) {
        return CustomItemsAPI.getCustomItemID(itemStack) != null;
    }

    @Override
    public ItemStack loadItem(ConfigurationSection configurationSection) {
        final String customItemsId1 = configurationSection.getString("customItemsId");
        if (customItemsId1 == null) return null;
        final ItemStack stack1 = CustomItemsAPI.getCustomItem(customItemsId1);
        if (stack1 != null && stack1.getType() != Material.AIR) return stack1;
        return null;
    }

    @Override
    public boolean compare(ItemStack itemInInventory, ItemStack itemInGui) {
        return itemInGui.getItemMeta().equals(itemInInventory.getItemMeta());
    }
}
