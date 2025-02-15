package mightydanp.industrialtech.api.common.inventory.container;

import mightydanp.industrialtech.api.common.handler.RegistryHandler;
import mightydanp.industrialtech.api.common.libs.Ref;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;

/**
 * Created by MightyDanp on 4/8/2021.
 */
public class Containers {
    public static ContainerType<ITToolItemContainer> itToolItemContainer;

    public static void init() {
        itToolItemContainer = IForgeContainerType.create(ITToolItemContainer::createContainerClientSide);
        RegistryHandler.CONTAINERS.register(ITToolItemContainer.itToolItemContainerContainerType, () -> itToolItemContainer);
    }
}
