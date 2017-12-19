package com.ukrtatnafta.messagebot.viberbot.api.message.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * Created by ivanov-av on 14.12.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternalKeyboard {
    @JsonProperty("Type")
    private String type;
    /**
     * required. Array containing all
     * keyboard buttons by order. See buttons
     * parameters below for buttons parameters details
     */
    @JsonProperty("Buttons")
    private Button[] buttons;
    /**
     * optional. Background color of the keyboard
     */
    @JsonProperty("BgColor")
    private String bgColor;
    /**
     * optional. When true - the keyboard will always
     * be displayed with the same height as the native
     * keyboard.When false - short keyboards will be
     * displayed with the minimal possible height.
     * Maximal height will be native keyboard height
     */
    @JsonProperty("DefaultHeight")
    private boolean defaultHeight;
    /**
     * optional (api level 3). How much percent of
     * free screen space in chat should be taken by
     * keyboard. The final height will be not less
     * than height of system keyboard
     * 40..70
     */
    @JsonProperty("CustomDefaultHeight")
    private int customDefaultHeight;
    /**
     * optional (api level 3). How much percent of
     * free screen space in chat should be taken by
     * keyboard. The final height will be not less
     * than height of system keyboard
     * 20..100
     */
    @JsonProperty("HeightScale")
    private int heightScale;
    /**
     * optional (api level 4). Represents size of block for
     * grouping buttons during layout
     * 1..6
     */
    @JsonProperty("ButtonGroupColumns")
    private int buttonsGroupColumns;
    /**
     * optional (api level 4). Represents size of block
     * for grouping buttons during layout
     * 1..7
     */
    @JsonProperty("ButtonGroupRows")
    private int buttonsGroupRows;
    /**
     * optional (api level 4). Customize the keyboard
     * input field. regular- display regular size input
     * field. minimized - display input field minimized
     * by default. hidden - hide the input field.
     * regular, minimized, hidden
     */
    @JsonProperty("InputFieldState")
    private String inputFieldState;

    public Button[] getButtons() {
        return buttons;
    }

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public boolean isDefaultHeight() {
        return defaultHeight;
    }

    public void setDefaultHeight(boolean defaultHeight) {
        this.defaultHeight = defaultHeight;
    }

    public int getCustomDefaultHeight() {
        return customDefaultHeight;
    }

    public void setCustomDefaultHeight(int customDefaultHeight) {
        this.customDefaultHeight = customDefaultHeight;
    }

    public int getHeightScale() {
        return heightScale;
    }

    public void setHeightScale(int heightScale) {
        this.heightScale = heightScale;
    }

    public int getButtonsGroupColumns() {
        return buttonsGroupColumns;
    }

    public void setButtonsGroupColumns(int buttonsGroupColumns) {
        this.buttonsGroupColumns = buttonsGroupColumns;
    }

    public int getButtonsGroupRows() {
        return buttonsGroupRows;
    }

    public void setButtonsGroupRows(int buttonsGroupRows) {
        this.buttonsGroupRows = buttonsGroupRows;
    }

    public String getInputFieldState() {
        return inputFieldState;
    }

    public void setInputFieldState(String inputFieldState) {
        this.inputFieldState = inputFieldState;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("buttons=").append(Arrays.toString(buttons));
        sb.append(", bgColor='").append(bgColor).append('\'');
        sb.append(", defaultHeight=").append(defaultHeight);
        sb.append(", customDefaultHeight=").append(customDefaultHeight);
        sb.append(", heightScale=").append(heightScale);
        sb.append(", buttonsGroupColumns=").append(buttonsGroupColumns);
        sb.append(", buttonsGroupRows=").append(buttonsGroupRows);
        sb.append(", inputFieldState='").append(inputFieldState).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
