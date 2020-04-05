package arquillian.extension;

import org.jboss.arquillian.container.test.spi.client.deployment.*;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.arquillian.core.spi.LoadableExtension.ExtensionBuilder;

public class ArquillianExtension implements LoadableExtension {

    @Override
    public void register(ExtensionBuilder builder) {
        builder.service(DeploymentScenarioGenerator.class, TestDeploymentPackager.class);
    }
}