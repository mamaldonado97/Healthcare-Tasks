package us.dit.humanTasks.service.services.kie;

import org.kie.server.client.ProcessServicesClient;
import org.kie.server.client.QueryServicesClient;
import org.kie.server.client.UIServicesClient;
import org.kie.server.client.UserTaskServicesClient;
import org.kie.server.client.admin.UserTaskAdminServicesClient;

public interface KieUtilService {

	ProcessServicesClient getProcessServicesClient();

	UserTaskServicesClient getUserTaskServicesClient();

	QueryServicesClient getQueryServicesClient();
	
	UIServicesClient getUIServicesClient();

	UserTaskAdminServicesClient getUserTaskAdminServicesClient();

}