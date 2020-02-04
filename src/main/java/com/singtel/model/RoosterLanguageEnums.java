package com.singtel.model;

public enum RoosterLanguageEnums {

        DANISH(CommonConstants.DANISH),
        DUTCH(CommonConstants.DUTCH),
        FINNISH(CommonConstants.FINNISH),
        FRENCH(CommonConstants.FRENCH),
        GERMAN(CommonConstants.GERMAN),
        GREEK(CommonConstants.GREEK),
        HEBREW(CommonConstants.HEBREW),
        HUNGARIAN(CommonConstants.HUNGARIAN),
        ITALIAN(CommonConstants.ITALIAN),
        JAPANESE(CommonConstants.JAPANESE),
        PORTUGUESE(CommonConstants.PORTUGUESE),
        RUSSIAN(CommonConstants.RUSSIAN),
        SWEDISH(CommonConstants.SWEDISH),
        TURKISH(CommonConstants.TURKISH),
        URDU(CommonConstants.URDU);

     public String language;
    /**
     *
     * @param language
     */
    RoosterLanguageEnums(String language) {
            this.language = language;
        }

    /**
     *
     * @return language
     */
    public String getLanguage() {
            return language;
        }
}
