package com.ishumei.l111l1111llIl;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.common.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.UByte;
import org.conscrypt.EvpMdRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l1111lIl {
    private static Object l1111l111111Il(Field field, Object obj) {
        try {
            Class<?> type = field.getType();
            if (type == Integer.class || type == Double.class || type == Float.class || type == Long.class) {
                if (obj == null) {
                    return -1;
                }
                return obj;
            }
            if (type == String.class) {
                return obj == null ? "" : obj;
            }
            if (type == Map.class) {
                return obj == null ? new JSONObject() : new JSONObject((Map) obj);
            }
            if (type != List.class && type != Set.class) {
                return obj == null ? type.newInstance() : obj;
            }
            return obj == null ? new JSONArray() : new JSONArray((Collection) obj);
        } catch (Exception unused) {
            return new Object();
        }
    }

    public static String l1111l111111Il(File file) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        if (!file.exists()) {
            throw new IOException("not exist");
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static String l1111l111111Il(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(CertificateUtil.DELIMITER);
            }
            String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO + hexString;
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    private static List<String> l1111l111111Il(File file, Set<String> set, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        if (!file.exists() || !file.canRead() || !file.isFile() || set == null || set.size() == 0) {
            return arrayList;
        }
        HashSet hashSet = new HashSet(set);
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            l1111l111111Il((Closeable) bufferedReader2);
                            return arrayList;
                        }
                        if (!l111l1111lI1l.l1111l111111Il(line)) {
                            Iterator it = hashSet.iterator();
                            if (i == 0) {
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    if (line.contains(str)) {
                                        arrayList.add(str);
                                        it.remove();
                                    }
                                }
                            } else if (i == 1) {
                                String lowerCase = line.toLowerCase();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    if (lowerCase.contains(str2.toLowerCase())) {
                                        arrayList.add(str2);
                                        it.remove();
                                    }
                                }
                            } else if (i == 2) {
                                while (it.hasNext()) {
                                    Matcher matcher = Pattern.compile((String) it.next()).matcher(line);
                                    while (matcher.find()) {
                                        arrayList.add(matcher.group(0));
                                    }
                                }
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        l1111l111111Il((Closeable) bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static List<String> l1111l111111Il(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            l1111l111111Il((Closeable) bufferedReader);
                            return arrayList;
                        }
                        if (!l111l1111lI1l.l1111l111111Il(line)) {
                            arrayList.add(line);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw new IOException(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                th = th2;
                l1111l111111Il((Closeable) bufferedReader);
                throw th;
            }
        } catch (Exception e3) {
            bufferedReader = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    private static List<String> l1111l111111Il(String str, Set<String> set, int i) {
        return l1111l111111Il(new File(str), set, i);
    }

    private static List<Object> l1111l111111Il(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                arrayList.add(l111l11111Il(objOpt));
            }
        }
        return arrayList;
    }

    private static Map<String, Object> l1111l111111Il(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, l111l11111Il(objOpt));
            }
        }
        return map;
    }

    private static JSONArray l1111l111111Il(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(l111l11111I1l(it.next()));
            }
        }
        return jSONArray;
    }

    public static JSONObject l1111l111111Il(Object obj) {
        JSONObject jSONObject = new JSONObject();
        if (obj == null) {
            return jSONObject;
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            try {
                if (!field.getName().equals("serialVersionUID")) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    com.ishumei.l1111l111111Il.l111l11111Il l111l11111il = (com.ishumei.l1111l111111Il.l111l11111Il) field.getAnnotation(com.ishumei.l1111l111111Il.l111l11111Il.class);
                    if (l111l11111il == null) {
                        jSONObject.put(field.getName(), obj2);
                    } else {
                        boolean zL111l11111I1l = l111l11111il.l111l11111I1l();
                        if (obj2 != null || zL111l11111I1l) {
                            jSONObject.put(l111l11111il.l1111l111111Il(), l111l11111il.l111l11111lIl() ? l1111l111111Il(obj2) : l1111l111111Il(field, obj2));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject l1111l111111Il(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new NullPointerException("key == null");
                }
                try {
                    jSONObject.put(str, l111l11111I1l(entry.getValue()));
                } catch (JSONException unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static void l1111l111111Il(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void l1111l111111Il(File file, String str) throws Throwable {
        if (l111l1111lI1l.l1111l111111Il(str)) {
            throw new IOException("file or bytes empty");
        }
        FileWriter fileWriter = null;
        try {
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                fileWriter2.write(str);
                fileWriter2.close();
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0053  */
    private static void l1111l111111Il(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        FileLock fileLock;
        if (bArr == null) {
            throw new IOException("file or bytes empty");
        }
        FileLock fileLockLock = null;
        FileChannel channel = null;
        fileLockLock = null;
        fileLockLock = null;
        fileLockLock = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                channel = fileOutputStream.getChannel();
                try {
                    fileLockLock = channel.lock();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    while (byteBufferWrap.hasRemaining()) {
                        channel.write(byteBufferWrap);
                    }
                    fileOutputStream.flush();
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    channel.close();
                    l1111l111111Il((Closeable) fileOutputStream);
                } catch (Exception e) {
                    e = e;
                    fileLock = fileLockLock;
                    fileOutputStream2 = fileOutputStream;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        FileLock fileLock2 = fileLock;
                        fileOutputStream = fileOutputStream2;
                        fileLockLock = fileLock2;
                        if (fileLockLock != null) {
                            fileLockLock.release();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        l1111l111111Il((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    l1111l111111Il((Closeable) fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                fileLock = fileLockLock;
                throw new IOException(e);
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            channel = null;
            fileOutputStream = null;
        }
    }

    private static void l1111l111111Il(String str, String str2) throws Throwable {
        if (l111l1111lI1l.l1111l111111Il(str) || l111l1111lI1l.l1111l111111Il(str2)) {
            throw new IOException("file or bytes empty");
        }
        byte[] bytes = str2.getBytes(Constants.UTF_8);
        if (l111l1111lI1l.l1111l111111Il(str) || bytes == null) {
            throw new IOException("filename or byes empty");
        }
        try {
            l1111l111111Il(new File(str), bytes);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static void l1111l111111Il(String str, byte[] bArr) throws Throwable {
        if (l111l1111lI1l.l1111l111111Il(str) || bArr == null) {
            throw new IOException("filename or byes empty");
        }
        try {
            l1111l111111Il(new File(str), bArr);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static void l1111l111111Il(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
    }

    private static byte[] l1111l111111Il(FileChannel fileChannel) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(100);
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = fileChannel.read(byteBufferAllocate, i);
                        if (i3 <= 0) {
                            break;
                        }
                        i += i3;
                        i2 += i3;
                    }
                    byte[] bArrArray = byteBufferAllocate.array();
                    if (i2 >= 4 && (bArrArray[0] & UByte.MAX_VALUE) == 0 && (bArrArray[1] & UByte.MAX_VALUE) == 0 && (bArrArray[2] & UByte.MAX_VALUE) == 0 && (bArrArray[3] & UByte.MAX_VALUE) == 0) {
                        throw new IOException("read bytes not utf-8");
                    }
                    byteArrayOutputStream2.write(bArrArray, 0, i2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    l1111l111111Il((Closeable) byteArrayOutputStream2);
                    return byteArray;
                } catch (Exception e) {
                    e = e;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    l1111l111111Il((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static Object l111l11111I1l(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(l111l11111I1l(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                return l111l11111lIl(obj);
            }
            if (obj instanceof Map) {
                return l1111l111111Il((Map<?, ?>) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static String l111l11111I1l(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return l111l11111I1l(str.getBytes(Constants.UTF_8));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l111l11111I1l(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME).digest(bArr);
            StringBuilder sb = new StringBuilder(bArrDigest.length << 1);
            for (byte b : bArrDigest) {
                int i = b & UByte.MAX_VALUE;
                if (i < 16) {
                    sb.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            throw new IOException("fail to md5 data");
        }
    }

    private static Object l111l11111Il(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return l1111l111111Il((JSONObject) obj);
        }
        return obj instanceof JSONArray ? l1111l111111Il((JSONArray) obj) : obj;
    }

    public static byte[] l111l11111Il(String str) throws IOException {
        try {
            return Base64.decode(str.getBytes(Constants.UTF_8), 0);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static String l111l11111lIl(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll(CertificateUtil.DELIMITER, "").toLowerCase();
    }

    public static String l111l11111lIl(byte[] bArr) throws IOException {
        try {
            return Base64.encodeToString(bArr, 2);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static List<String> l111l11111lIl(File file, Set<String> set, int i) {
        String[] list;
        ArrayList arrayList = new ArrayList();
        if (file.isDirectory() && set != null && set.size() != 0 && (list = file.list()) != null && list.length != 0) {
            HashSet hashSet = new HashSet(set);
            for (String str : list) {
                Iterator it = hashSet.iterator();
                if (i == 0) {
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (str.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                } else if (i == 1) {
                    String lowerCase = str.toLowerCase();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (lowerCase.contains(str3.toLowerCase())) {
                            arrayList.add(str3);
                        }
                    }
                } else if (i == 2) {
                    while (it.hasNext()) {
                        if (Pattern.compile((String) it.next()).matcher(str).find()) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<String> l111l11111lIl(String str, Set<String> set, int i) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : l111l11111lIl(new File(str), set, i);
    }

    private static JSONArray l111l11111lIl(Object obj) throws JSONException {
        if (!obj.getClass().isArray()) {
            throw new JSONException("Not a primitive data: " + obj.getClass());
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < length; i++) {
            jSONArray.put(l111l11111I1l(Array.get(obj, i)));
        }
        return jSONArray;
    }

    public static String l111l1111l1Il(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Patterns.DOMAIN_NAME.matcher(str);
        if (matcher.find()) {
            return matcher.group(0);
        }
        return null;
    }

    public static boolean l111l1111lI1l(String str) {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || context.checkSelfPermission(str) == 0;
    }

    private static boolean l111l1111lIl(String str) {
        try {
            return new File(Environment.getExternalStorageDirectory() + "/" + str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean l111l1111llIl(String str) {
        if (str == null) {
            return false;
        }
        return Patterns.IP_ADDRESS.matcher(str).matches();
    }

    private static String l11l1111I11l(String str) throws IOException {
        try {
            return l1111l111111Il(new File(str));
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static String l11l1111I1l(String str) {
        if (str != null && str.length() != 0) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static boolean l11l1111lIIl(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }
}
