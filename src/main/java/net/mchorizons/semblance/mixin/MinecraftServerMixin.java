package net.mchorizons.semblance.mixin;

import net.mchorizons.semblance.Config;
import net.mchorizons.semblance.MinecraftServerInterface;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin implements MinecraftServerInterface {
	@ModifyReturnValue(method = "getServerModName", at = @At("RETURN"))
	public String replaceServerModName(String original) {
		return Config.getServerBrand();
	}
}
