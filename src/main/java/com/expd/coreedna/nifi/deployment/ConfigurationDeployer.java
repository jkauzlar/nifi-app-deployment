package com.expd.coreedna.nifi.deployment;

import okhttp3.OkHttpClient;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.AccessApi;
import org.openapitools.client.api.FlowApi;
import org.openapitools.client.api.ProcessGroupsApi;
import org.openapitools.client.model.BucketEntity;
import org.openapitools.client.model.BucketsEntity;

import java.util.Objects;
import java.util.Optional;

public class ConfigurationDeployer {
    private ApiClient apiClient;

    public ConfigurationDeployer(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public static void main(String[] args) throws ApiException {
        if(args.length != 3) {
            showHelpAndExit();
        }
        var basePath = args[0];
        var serviceAccountUser = args[1];
        var serviceAccountPasswordFile = args[2];

        var client = new OkHttpClient.Builder().build();
        var apiClient = new ApiClient(client);
        apiClient.setBasePath(basePath);

        var accessApi = new AccessApi(apiClient);

        apiClient.setAccessToken(accessApi.createAccessToken(serviceAccountUser, serviceAccountPasswordFile));

        new ConfigurationDeployer(apiClient).runDeployment();
    }

    private void runDeployment() throws ApiException {
        BucketsEntity buckets = new FlowApi(apiClient).getBuckets("registryId");
        if (buckets.getBuckets() != null) {
            Optional<BucketEntity> bucketOpt = buckets.getBuckets().stream().filter(b -> Objects.equals(b.getId(), "hi")).findFirst();
            bucketOpt.ifPresent(b -> {

            });
        }
    }

    private static void showHelpAndExit() {
        System.exit(-1);
    }
}
