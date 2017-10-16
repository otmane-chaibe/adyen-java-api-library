/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model.marketpay.notification;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-11T12:23:08.541Z")
public class InlineResponse200 {
    @SerializedName("submittedAsync")
    private Boolean submittedAsync = null;

    @SerializedName("configurationDetails")
    private CreateNotificationConfigurationConfigurationDetails configurationDetails = null;

    @SerializedName("pspReference")
    private String pspReference = null;

    public InlineResponse200 submittedAsync(Boolean submittedAsync) {
        this.submittedAsync = submittedAsync;
        return this;
    }

    /**
     * Get submittedAsync
     *
     * @return submittedAsync
     **/
    public Boolean getSubmittedAsync() {
        return submittedAsync;
    }

    public void setSubmittedAsync(Boolean submittedAsync) {
        this.submittedAsync = submittedAsync;
    }

    public InlineResponse200 configurationDetails(CreateNotificationConfigurationConfigurationDetails configurationDetails) {
        this.configurationDetails = configurationDetails;
        return this;
    }

    /**
     * Get configurationDetails
     *
     * @return configurationDetails
     **/
    public CreateNotificationConfigurationConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
    }

    public void setConfigurationDetails(CreateNotificationConfigurationConfigurationDetails configurationDetails) {
        this.configurationDetails = configurationDetails;
    }

    public InlineResponse200 pspReference(String pspReference) {
        this.pspReference = pspReference;
        return this;
    }

    /**
     * psp reference
     *
     * @return pspReference
     **/
    public String getPspReference() {
        return pspReference;
    }

    public void setPspReference(String pspReference) {
        this.pspReference = pspReference;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponse200 inlineResponse200 = (InlineResponse200) o;
        return Objects.equals(this.submittedAsync, inlineResponse200.submittedAsync)
                && Objects.equals(this.configurationDetails, inlineResponse200.configurationDetails)
                && Objects.equals(this.pspReference, inlineResponse200.pspReference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submittedAsync, configurationDetails, pspReference);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");

        sb.append("    submittedAsync: ").append(toIndentedString(submittedAsync)).append("\n");
        sb.append("    configurationDetails: ").append(toIndentedString(configurationDetails)).append("\n");
        sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

