package fi.oulumo.lambda.apigateway.common.dto;

import fi.oulumo.lambda.core.buildinfo.BuildInfo;

/**
 * @author Zsolt Homorodi (zsolt.homorodi@oulumo.com)
 */
public class ApiInfo {
    private String name;
    private String version;
    private String description;
    private String contactPerson;
    private String license;
    private String licenseUrl;
    private String termsOfServiceUrl;
    private String privacyPolicyUrl;

    protected ApiInfo() {
        // To be used by serialization / IoC frameworks only.
    }

    public ApiInfo(String description, String contactPerson, String license) {
        this(BuildInfo.getLambdaName(), BuildInfo.getBuildVersion(), description, contactPerson, license, null, null, null);
    }

    public ApiInfo(String description, String contactPerson, String license, String licenseUrl, String termsOfServiceUrl, String privacyPolicyUrl) {
        this(BuildInfo.getLambdaName(), BuildInfo.getBuildVersion(), description, contactPerson, license, licenseUrl, termsOfServiceUrl, privacyPolicyUrl);
    }

    public ApiInfo(String name, String version, String description, String contactPerson, String license) {
        this(name, version, description, contactPerson, license, null, null, null);
    }

    public ApiInfo(String name, String version, String description, String contactPerson, String license, String licenseUrl, String termsOfServiceUrl, String privacyPolicyUrl) {
        this.name = name;
        this.version = version;
        this.description = description;
        this.contactPerson = contactPerson;
        this.license = license;
        this.licenseUrl = licenseUrl;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDescription() {
        return description;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getLicense() {
        return license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }
}
