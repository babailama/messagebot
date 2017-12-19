package com.ukrtatnafta.messagebot.viberbot.api.message.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ivanov-av on 14.12.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternalBrowser {
    /**
     * Optional (api level 3). Action button in internal’s
     * browser navigation bar. forward - will open the
     * forward via Viber screen and share current URL or
     * predefined URL. send - sends the currently opened
     * URL as an URL message, or predefined URL if property
     * ActionPredefinedURL is not empty. open-externally -
     * opens external browser with the current URL.
     * none - will not display any button.
     * Possible values: forward, send, open-externally, none
     */
    @JsonProperty("ActionButton")
    private String actionButton;
    /**
     * Optional (api level 3). If ActionButton is send or
     * forward then the value from this property will be used
     * to be sent as message, otherwise ignored
     * Possible values: String with 1 or more characters
     */
    @JsonProperty("ActionPredefinedURL")
    private String actionPredefinedURL;
    /**
     * Optional (api level 3). Type of title for internal browser
     * if has no CustomTitle field. default means the content in
     * the page’s <OG:title> element or in <title> tag. domain
     * means the top level domain.
     * Possible values: domain, default
     */
    @JsonProperty("TitleType")
    private String titleType;
    /**
     * Optional (api level 3). Custom text for internal’s browser
     * title, TitleType will be ignored in case this
     * key is presented
     * Possible values:  String up to 15 characters
     */
    @JsonProperty("CustomTitle")
    private String customTitle;
    /**
     * optional (api level 3). Indicates that browser should be
     * opened in a full screen or in partial size (50% of screen height).
     * Full screen mode can be with orientation lock (both orientations
     * supported, only landscape or only portrait)
     * Possible values:  fullscreen, fullscreen-portrait,
     * fullscreen-landscape, partial-size
     */
    @JsonProperty("Mode")
    private String mode;
    /**
     * Optional (api level 3). Should the browser’s footer will be
     * displayed (default) or not (hidden).
     * Possible values: default, hidden
     */
    @JsonProperty("FooterType")
    private String footerType;

    public String getActionButton() {
        return actionButton;
    }

    public void setActionButton(String actionButton) {
        this.actionButton = actionButton;
    }

    public String getActionPredefinedURL() {
        return actionPredefinedURL;
    }

    public void setActionPredefinedURL(String actionPredefinedURL) {
        this.actionPredefinedURL = actionPredefinedURL;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getFooterType() {
        return footerType;
    }

    public void setFooterType(String footerType) {
        this.footerType = footerType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InternalBrowser{");
        sb.append("actionButton='").append(actionButton).append('\'');
        sb.append(", actionPredefinedURL='").append(actionPredefinedURL).append('\'');
        sb.append(", titleType='").append(titleType).append('\'');
        sb.append(", customTitle='").append(customTitle).append('\'');
        sb.append(", mode='").append(mode).append('\'');
        sb.append(", footerType='").append(footerType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
