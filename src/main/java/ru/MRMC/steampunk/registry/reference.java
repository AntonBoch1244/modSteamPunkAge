package ru.MRMC.steampunk.registry;

import cpw.mods.fml.common.Loader;

public class reference
{
    public static final String MOD_ID = "steampunk";
    public static final String MOD_NAME = "Steampunk Age";
    private static final String BUILD_TYPE = "ALPHA";
    public static final char SEPARATOR = '.';
    private static final String MAJOR_NUMBER = "1";
    private static final String MINOR_NUMBER = "0";
    private static final String RELEASE = "1";
    private static final String PATCH = "4";
    public static final String MOD_VERSION = Loader.MC_VERSION + "-" + MAJOR_NUMBER + SEPARATOR + MINOR_NUMBER + SEPARATOR + RELEASE + SEPARATOR + PATCH + ':' + BUILD_TYPE;
}
