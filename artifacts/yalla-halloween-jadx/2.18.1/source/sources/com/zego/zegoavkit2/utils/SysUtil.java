package com.zego.zegoavkit2.utils;

import android.os.Build;
import com.facebook.internal.security.CertificateUtil;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class SysUtil {
    private static void closeReader(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getOsInfo() {
        return (Build.MANUFACTURER + CertificateUtil.DELIMITER + Build.VERSION.RELEASE + CertificateUtil.DELIMITER + Build.MODEL + CertificateUtil.DELIMITER + Build.VERSION.SDK_INT + CertificateUtil.DELIMITER + Build.BRAND).replaceAll(",", ".");
    }

    public static String getSoCModel() throws Throwable {
        String prop;
        String soCModelFromCPUInfo = getSoCModelFromCPUInfo();
        if (isValidSoCModel(soCModelFromCPUInfo)) {
            prop = soCModelFromCPUInfo.split(ZegoConstants.ZegoVideoDataAuxPublishingStream)[0];
        } else {
            prop = readProp("ro.board.platform");
            if (!isValidSoCModel(prop)) {
                prop = Build.HARDWARE;
                if (!isValidSoCModel(prop) && prop == null) {
                    prop = "";
                }
            }
        }
        return prop.toLowerCase();
    }

    public static String getSoCModelFromCPUInfo() {
        BufferedReader bufferedReader;
        MatchResult matchResult;
        File file = new File("/proc/cpuinfo");
        String strGroup = "";
        if (file.exists() && file.canRead()) {
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 8192);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.startsWith("Hardware")) {
                            Matcher matcher = Pattern.compile("sm\\d+.*").matcher(line.toLowerCase());
                            if (matcher.find()) {
                                matchResult = matcher.toMatchResult();
                            } else {
                                Matcher matcher2 = Pattern.compile("sdm\\d+.*").matcher(line.toLowerCase());
                                if (matcher2.find()) {
                                    matchResult = matcher2.toMatchResult();
                                } else {
                                    Matcher matcher3 = Pattern.compile("msm\\d+.*").matcher(line.toLowerCase());
                                    if (matcher3.find()) {
                                        matchResult = matcher3.toMatchResult();
                                    } else {
                                        Matcher matcher4 = Pattern.compile("apq\\d+.*").matcher(line.toLowerCase());
                                        if (matcher4.find()) {
                                            matchResult = matcher4.toMatchResult();
                                        } else {
                                            Matcher matcher5 = Pattern.compile("((waipio)|(lahaina)|(kona)|(huracan)|(hana)|(napali)|(nairo)|(lito)|(atoll)|(trinket)|(bengal))").matcher(line.toLowerCase());
                                            if (matcher5.find()) {
                                                matchResult = matcher5.toMatchResult();
                                            } else {
                                                Matcher matcher6 = Pattern.compile("kirin\\d+.*").matcher(line.toLowerCase());
                                                if (matcher6.find()) {
                                                    matchResult = matcher6.toMatchResult();
                                                } else {
                                                    Matcher matcher7 = Pattern.compile("hi\\d+.*").matcher(line.toLowerCase());
                                                    if (matcher7.find()) {
                                                        matchResult = matcher7.toMatchResult();
                                                    } else {
                                                        Matcher matcher8 = Pattern.compile("mt\\d+.*").matcher(line.toLowerCase());
                                                        if (matcher8.find()) {
                                                            matchResult = matcher8.toMatchResult();
                                                        } else {
                                                            Matcher matcher9 = Pattern.compile("kompanio\\d+.*").matcher(line.toLowerCase());
                                                            if (matcher9.find()) {
                                                                matchResult = matcher9.toMatchResult();
                                                            } else {
                                                                Matcher matcher10 = Pattern.compile("(samsung)?e(xynos)?\\d+.*").matcher(line.toLowerCase());
                                                                if (matcher10.find()) {
                                                                    matchResult = matcher10.toMatchResult();
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            strGroup = matchResult.group(0);
                            break;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                        e.printStackTrace();
                        bufferedReader = bufferedReader2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            closeReader(bufferedReader);
        }
        return strGroup;
    }

    public static String getVersion() {
        return Build.VERSION.RELEASE.replaceAll(",", ".");
    }

    public static boolean isValidSoCModel(String str) {
        if (str != null && !str.isEmpty()) {
            String lowerCase = str.trim().toLowerCase();
            if (Pattern.matches("^sm\\d+.*", lowerCase) || Pattern.matches("^sdm\\d+.*", lowerCase) || Pattern.matches("^msm\\d+.*", lowerCase) || Pattern.matches("^apq\\d+.*", lowerCase) || Pattern.matches("^((waipio)|(lahaina)|(kona)|(huracan)|(hana)|(napali)|(nairo)|(lito)|(atoll)|(trinket)|(bengal))", lowerCase) || Pattern.matches("^kirin\\d+.*", lowerCase) || Pattern.matches("^hi\\d+.*", lowerCase) || Pattern.matches("^mt\\d+.*", lowerCase) || Pattern.matches("^kompanio\\d+.*", lowerCase) || Pattern.matches("^(samsung)?e(xynos)?\\d+.*", lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public static String readProp(String str) throws Throwable {
        Process processStart;
        BufferedReader bufferedReader = null;
        try {
            processStart = new ProcessBuilder(new String[0]).command("getprop", str).redirectErrorStream(true).start();
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                try {
                    String line = bufferedReader2.readLine();
                    String str2 = line != null ? line : "";
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                    processStart.destroy();
                    return str2;
                } catch (Exception unused2) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (processStart != null) {
                        processStart.destroy();
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (processStart == null) {
                        throw th;
                    }
                    processStart.destroy();
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused6) {
            processStart = null;
        } catch (Throwable th3) {
            th = th3;
            processStart = null;
        }
    }
}
