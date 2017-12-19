package com.ukrtatnafta.messagebot.viberbot.api.message.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ukrtatnafta.messagebot.viberbot.enums.ActionTypeEnum;

import java.util.Arrays;

/**
 * Created by ivanov-av on 14.12.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Button {
    /**
     * Optional. Button width in columns.
     */
    @JsonProperty("Columns")
    private int columns;
    /**
     * Optional. Button height in rows.
     */
    @JsonProperty("Rows")
    private int rows;
    /**
     * Optional. Background color of button. Valid color HEX value.
     * i.e. "#2db9b9"
     */
    @JsonProperty("BgColor")
    private String bgColor;
    /**
     * Optional. Determine whether the user action is presented in the conversation
     */
    @JsonProperty("Silent")
    private boolean silent;
    /**
     * Optional. Type of the background media
     * jpeg, png, gif
     */
    @JsonProperty("BgMediaType")
    private String bgMediaType;
    /**
     * Optional. URL for background media content (picture or gif).
     * Will be placed with aspect to fill logic. Max size: 500 kb.
     */
    @JsonProperty("BgMedia")
    private String bgMedia;
    /**
     * Optional. When true - animated background media (gif) will
     * loop continuously. When false - animated background media
     * will play once and stop.
     */
    @JsonProperty("BgLoop")
    private boolean bgLoop;
    /**
     * Optional. Type of action pressing the button will perform.
     * Reply - will send a reply to the PA. open-url - will
     * open the specified URL and send the URL as reply to the PA
     * Possible values: reply, open-url, location-picker, share-phone, none
     */
    @JsonProperty("ActionType")
    private ActionTypeEnum actionType;
    /**
     * Required. Text for reply and none.
     * ActionType or URL for open-url.
     * Keyboard Reply logic
     * Pressing a keyboard button would trigger a different reply depending
     * on the buttons “actionType” value.
     * For ActionType reply:
     * The value of ActionBody is sent as a text message to account (via message event).
     * The value of text appears in the chat thread as message from the user.
     * If no text available, the value of image is used.
     * If no image available, the value of BgMedia is used.
     * If no BgMedia available, the value of BgColor is used.
     * If no BgColor available, the default value of BgColor (white) is used.
     * For ActionType open-url:
     * The value of ActionBody is sent as a text message to account (via message event).
     * The value of ActionBody is opened in the browser.
     * The value of ActionBody appears in the chat thread as message from the user.
     * For ActionType share-phone - api level 3 and above:
     * The client will share be able to share its phone number via a ContactMessage object.
     * For ActionType location-picker - api level 3 and above:
     * The client will share be able to share their location via a LocationMessage object.
     * For ActionType none:
     * Nothing is sent to the user or account. Just an informative button.
     * Note: The none action type is supported on devices running Viber version 6.7 and above.
     */
    @JsonProperty("ActionBody")
    private String actionBody;
    /**
     * Optional. URL of image to place on top of background (if any). Can be a partially transparent
     * image that will allow showing some of the background. Will be placed with aspect to fill logic.
     * Valid URL. JPEG and PNG files are supported. Max size: 500 kb
     */
    @JsonProperty("Image")
    private String image;
    /**
     * Optional. Text to be displayed on the button.
     * Can contain some HTML tags - see keyboard design for more details
     * Free text. Valid and allowed HTML tags Max 250 characters. If the
     * text is too long to display on the button it will be cropped and
     * ended with “…”
     */
    @JsonProperty("Text")
    private String text;
    /**
     * Optional. Vertical alignment of the text.
     * Possible values: top, middle, bottom.
     */
    @JsonProperty("TextVAlign")
    private String textVAlign;
    /**
     * Optional. Horizontal align of the text.
     * Possible values: left, center, right
     */
    @JsonProperty("TextHAlign")
    private String textHAlign;
    /**
     * Optional (api level 4). Custom paddings for the text
     * in points. The value is an array of Integers [top, left, bottom, right]
     * 0..12
     * i.e. [12,12,12,12]
     */
    @JsonProperty("TextPaddings")
    private int[] textPaddings;
    /**
     * Optional. Text opacity
     * 0-100
     */
    @JsonProperty("TextOpacity")
    private int textOpacity;
    /**
     * Optional. Text size out of 3 available options
     * Possible values: small, regular, large
     */
    @JsonProperty("TextSize")
    private String textSize;
    @JsonProperty("InternalBrowser")
    private InternalBrowser internalBrowser;

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public boolean isSilent() {
        return silent;
    }

    public void setSilent(boolean silent) {
        this.silent = silent;
    }

    public String getBgMediaType() {
        return bgMediaType;
    }

    public void setBgMediaType(String bgMediaType) {
        this.bgMediaType = bgMediaType;
    }

    public String getBgMedia() {
        return bgMedia;
    }

    public void setBgMedia(String bgMedia) {
        this.bgMedia = bgMedia;
    }

    public boolean isBgLoop() {
        return bgLoop;
    }

    public void setBgLoop(boolean bgLoop) {
        this.bgLoop = bgLoop;
    }

    public String getActionType() {
        return actionType.getName();
    }

    public void setActionType(String actionType) {
        this.actionType = ActionTypeEnum.get(actionType);
    }

    public String getActionBody() {
        return actionBody;
    }

    public void setActionBody(String actionBody) {
        this.actionBody = actionBody;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextVAlign() {
        return textVAlign;
    }

    public void setTextVAlign(String textVAlign) {
        this.textVAlign = textVAlign;
    }

    public String getTextHAlign() {
        return textHAlign;
    }

    public void setTextHAlign(String textHAlign) {
        this.textHAlign = textHAlign;
    }

    public int[] getTextPaddings() {
        return textPaddings;
    }

    public void setTextPaddings(int[] textPaddings) {
        this.textPaddings = textPaddings;
    }

    public int getTextOpacity() {
        return textOpacity;
    }

    public void setTextOpacity(int textOpacity) {
        this.textOpacity = textOpacity;
    }

    public String getTextSize() {
        return textSize;
    }

    public void setTextSize(String textSize) {
        this.textSize = textSize;
    }

    public InternalBrowser getInternalBrowser() {
        return internalBrowser;
    }

    public void setInternalBrowser(InternalBrowser internalBrowser) {
        this.internalBrowser = internalBrowser;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Button{");
        sb.append("columns=").append(columns);
        sb.append(", rows=").append(rows);
        sb.append(", bgColor='").append(bgColor).append('\'');
        sb.append(", silent=").append(silent);
        sb.append(", bgMediaType='").append(bgMediaType).append('\'');
        sb.append(", bgMedia='").append(bgMedia).append('\'');
        sb.append(", bgLoop=").append(bgLoop);
        sb.append(", actionType=").append(actionType);
        sb.append(", actionBody='").append(actionBody).append('\'');
        sb.append(", image='").append(image).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", textVAlign='").append(textVAlign).append('\'');
        sb.append(", textHAlign='").append(textHAlign).append('\'');
        sb.append(", textPaddings=").append(Arrays.toString(textPaddings));
        sb.append(", textOpacity=").append(textOpacity);
        sb.append(", textSize='").append(textSize).append('\'');
        sb.append(", internalBrowser=").append(internalBrowser);
        sb.append('}');
        return sb.toString();
    }
}
