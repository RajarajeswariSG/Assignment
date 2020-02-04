package com.singtel.model;

public class LanguagePOC {

    /**
     *
     * @param animalSound
     * @param secondLanguage
     * @return
     */
    public static String translate(String animalSound, RoosterLanguageEnums secondLanguage) {
        if (secondLanguage == null || !animalSound.equals(AnimalSoundEnums.ROOSTER.getAnimalsSound())) {
            System.out.println("Unable to translate the second language: " + animalSound);
            return animalSound;
        }

        switch (secondLanguage) {
            case DANISH:
                return RoosterLanguageEnums.DANISH.getLanguage();
            case DUTCH:
                return RoosterLanguageEnums.DUTCH.getLanguage();
            case FINNISH:
                return RoosterLanguageEnums.FINNISH.getLanguage();
            case FRENCH:
                return RoosterLanguageEnums.FRENCH.getLanguage();
            case GERMAN:
                return RoosterLanguageEnums.GERMAN.getLanguage();
            case GREEK:
                return RoosterLanguageEnums.GREEK.getLanguage();
            case HEBREW:
                return RoosterLanguageEnums.HEBREW.getLanguage();
            case HUNGARIAN:
                return RoosterLanguageEnums.HUNGARIAN.getLanguage();
            case ITALIAN:
                return RoosterLanguageEnums.ITALIAN.getLanguage();
            case JAPANESE:
                return RoosterLanguageEnums.JAPANESE.getLanguage();
            case PORTUGUESE:
                return RoosterLanguageEnums.PORTUGUESE.getLanguage();
            case RUSSIAN:
                return RoosterLanguageEnums.RUSSIAN.getLanguage();
            case SWEDISH:
                return RoosterLanguageEnums.SWEDISH.getLanguage();
            case TURKISH:
                return RoosterLanguageEnums.TURKISH.getLanguage();
            case URDU:
                return RoosterLanguageEnums.URDU.getLanguage();
            default:
                System.out.println("Unable to translate to second : " + secondLanguage);
                return animalSound;
        }
    }

}