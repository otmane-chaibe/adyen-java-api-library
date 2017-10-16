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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * NotificationConfigurationDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-11T12:23:08.541Z")
public class NotificationConfigurationDetails {
    @SerializedName("settings")
    private Map<String, String> settings = null;

    @SerializedName("apiVersion")
    private Integer apiVersion = null;

    @SerializedName("eventConfigs")
    private List<CreateNotificationConfigurationConfigurationDetailsEventConfigs> eventConfigs = null;

    /**
     * data interchange format
     */
    @JsonAdapter(MessageFormatEnum.Adapter.class)
    public enum MessageFormatEnum {
        JSON("JSON"),

        SOAP("SOAP");

        private String value;

        MessageFormatEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static MessageFormatEnum fromValue(String text) {
            for (MessageFormatEnum b : MessageFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<MessageFormatEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MessageFormatEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MessageFormatEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MessageFormatEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("messageFormat")
    private MessageFormatEnum messageFormat = null;

    @SerializedName("notifyUsername")
    private String notifyUsername = null;

    /**
     * SSL protocol
     */
    @JsonAdapter(SslProtocolEnum.Adapter.class)
    public enum SslProtocolEnum {
        SSL("SSL"),

        SSLINSECURECIPHERS("SSLInsecureCiphers"),

        SSLV3("SSLv3"),

        TLS("TLS"),

        TLSV10("TLSv10"),

        TLSV10INSECURECIPHERS("TLSv10InsecureCiphers"),

        TLSV11("TLSv11"),

        TLSV12("TLSv12");

        private String value;

        SslProtocolEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SslProtocolEnum fromValue(String text) {
            for (SslProtocolEnum b : SslProtocolEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<SslProtocolEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SslProtocolEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SslProtocolEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SslProtocolEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("sslProtocol")
    private SslProtocolEnum sslProtocol = null;

    @SerializedName("notifyURL")
    private String notifyURL = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("active")
    private Boolean active = null;

    @SerializedName("notificationId")
    private Long notificationId = null;

    @SerializedName("sendActionHeader")
    private Boolean sendActionHeader = null;

    @SerializedName("notifyPassword")
    private String notifyPassword = null;

    public NotificationConfigurationDetails settings(Map<String, String> settings) {
        this.settings = settings;
        return this;
    }

    public NotificationConfigurationDetails putSettingsItem(String key, String settingsItem) {
        if (this.settings == null) {
            this.settings = new HashMap<String, String>();
        }
        this.settings.put(key, settingsItem);
        return this;
    }

    /**
     * additional notification settings
     *
     * @return settings
     **/
    public Map<String, String> getSettings() {
        return settings;
    }

    public void setSettings(Map<String, String> settings) {
        this.settings = settings;
    }

    public NotificationConfigurationDetails apiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * api version to use
     *
     * @return apiVersion
     **/
    public Integer getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

    public NotificationConfigurationDetails eventConfigs(List<CreateNotificationConfigurationConfigurationDetailsEventConfigs> eventConfigs) {
        this.eventConfigs = eventConfigs;
        return this;
    }

    public NotificationConfigurationDetails addEventConfigsItem(CreateNotificationConfigurationConfigurationDetailsEventConfigs eventConfigsItem) {
        if (this.eventConfigs == null) {
            this.eventConfigs = new ArrayList<CreateNotificationConfigurationConfigurationDetailsEventConfigs>();
        }
        this.eventConfigs.add(eventConfigsItem);
        return this;
    }

    /**
     * types of the events thiggering the notification
     *
     * @return eventConfigs
     **/
    public List<CreateNotificationConfigurationConfigurationDetailsEventConfigs> getEventConfigs() {
        return eventConfigs;
    }

    public void setEventConfigs(List<CreateNotificationConfigurationConfigurationDetailsEventConfigs> eventConfigs) {
        this.eventConfigs = eventConfigs;
    }

    public NotificationConfigurationDetails messageFormat(MessageFormatEnum messageFormat) {
        this.messageFormat = messageFormat;
        return this;
    }

    /**
     * data interchange format
     *
     * @return messageFormat
     **/
    public MessageFormatEnum getMessageFormat() {
        return messageFormat;
    }

    public void setMessageFormat(MessageFormatEnum messageFormat) {
        this.messageFormat = messageFormat;
    }

    public NotificationConfigurationDetails notifyUsername(String notifyUsername) {
        this.notifyUsername = notifyUsername;
        return this;
    }

    /**
     * username to access notification URL
     *
     * @return notifyUsername
     **/
    public String getNotifyUsername() {
        return notifyUsername;
    }

    public void setNotifyUsername(String notifyUsername) {
        this.notifyUsername = notifyUsername;
    }

    public NotificationConfigurationDetails sslProtocol(SslProtocolEnum sslProtocol) {
        this.sslProtocol = sslProtocol;
        return this;
    }

    /**
     * SSL protocol
     *
     * @return sslProtocol
     **/
    public SslProtocolEnum getSslProtocol() {
        return sslProtocol;
    }

    public void setSslProtocol(SslProtocolEnum sslProtocol) {
        this.sslProtocol = sslProtocol;
    }

    public NotificationConfigurationDetails notifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
        return this;
    }

    /**
     * notification URL
     *
     * @return notifyURL
     **/
    public String getNotifyURL() {
        return notifyURL;
    }

    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

    public NotificationConfigurationDetails description(String description) {
        this.description = description;
        return this;
    }

    /**
     * notification configuration description
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NotificationConfigurationDetails active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * indicates if the notification configuration is active
     *
     * @return active
     **/
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public NotificationConfigurationDetails notificationId(Long notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * Id of the notification configuration. Is ignored when the notification configuration has to be created
     *
     * @return notificationId
     **/
    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public NotificationConfigurationDetails sendActionHeader(Boolean sendActionHeader) {
        this.sendActionHeader = sendActionHeader;
        return this;
    }

    /**
     * indicates if action header has to be added to SOAP notifications
     *
     * @return sendActionHeader
     **/
    public Boolean getSendActionHeader() {
        return sendActionHeader;
    }

    public void setSendActionHeader(Boolean sendActionHeader) {
        this.sendActionHeader = sendActionHeader;
    }

    public NotificationConfigurationDetails notifyPassword(String notifyPassword) {
        this.notifyPassword = notifyPassword;
        return this;
    }

    /**
     * password to access notification URL
     *
     * @return notifyPassword
     **/
    public String getNotifyPassword() {
        return notifyPassword;
    }

    public void setNotifyPassword(String notifyPassword) {
        this.notifyPassword = notifyPassword;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotificationConfigurationDetails notificationConfigurationDetails = (NotificationConfigurationDetails) o;
        return Objects.equals(this.settings, notificationConfigurationDetails.settings)
                && Objects.equals(this.apiVersion, notificationConfigurationDetails.apiVersion)
                && Objects.equals(this.eventConfigs, notificationConfigurationDetails.eventConfigs)
                && Objects.equals(this.messageFormat, notificationConfigurationDetails.messageFormat)
                && Objects.equals(this.notifyUsername, notificationConfigurationDetails.notifyUsername)
                && Objects.equals(this.sslProtocol, notificationConfigurationDetails.sslProtocol)
                && Objects.equals(this.notifyURL, notificationConfigurationDetails.notifyURL)
                && Objects.equals(this.description, notificationConfigurationDetails.description)
                && Objects.equals(this.active, notificationConfigurationDetails.active)
                && Objects.equals(this.notificationId, notificationConfigurationDetails.notificationId)
                && Objects.equals(this.sendActionHeader, notificationConfigurationDetails.sendActionHeader)
                && Objects.equals(this.notifyPassword, notificationConfigurationDetails.notifyPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, apiVersion, eventConfigs, messageFormat, notifyUsername, sslProtocol, notifyURL, description, active, notificationId, sendActionHeader, notifyPassword);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationConfigurationDetails {\n");

        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    eventConfigs: ").append(toIndentedString(eventConfigs)).append("\n");
        sb.append("    messageFormat: ").append(toIndentedString(messageFormat)).append("\n");
        sb.append("    notifyUsername: ").append(toIndentedString(notifyUsername)).append("\n");
        sb.append("    sslProtocol: ").append(toIndentedString(sslProtocol)).append("\n");
        sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    sendActionHeader: ").append(toIndentedString(sendActionHeader)).append("\n");
        sb.append("    notifyPassword: ").append(toIndentedString(notifyPassword)).append("\n");
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

