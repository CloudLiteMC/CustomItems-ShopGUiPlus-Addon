package net.cloudlite.plugin;

import net.brcdev.shopgui.ShopGuiPlusApi;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginAddon extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ShopGuiPlusApi.getPlugin().getItemManager().registerItemProvider(new CustomItemProvider(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
