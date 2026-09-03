package com.amazonaws.services.s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.util.StringUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class RestUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<String> f10663OooO00o = Arrays.asList("acl", "torrent", "logging", "location", "policy", "requestPayment", "versioning", "versions", "versionId", "notification", "uploadId", "uploads", "partNumber", "website", "delete", "lifecycle", "tagging", "cors", "restore", "replication", "accelerate", "inventory", "analytics", "metrics", "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires");

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public static <T> String OooO00o(String str, String str2, Request<T> request, String str3, Collection<String> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append(str + "\n");
        DefaultRequest defaultRequest = (DefaultRequest) request;
        ?? r1 = defaultRequest.f10289OooO0Oo;
        TreeMap treeMap = new TreeMap();
        if (r1 != 0 && r1.size() > 0) {
            for (Map.Entry entry : r1.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                if (str4 != null) {
                    String strOooO00o = StringUtils.OooO00o(str4);
                    if ("content-type".equals(strOooO00o) || "content-md5".equals(strOooO00o) || "date".equals(strOooO00o) || strOooO00o.startsWith("x-amz-")) {
                        treeMap.put(strOooO00o, str5);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (str3 != null) {
            treeMap.put("date", str3);
        }
        if (!treeMap.containsKey("content-type")) {
            treeMap.put("content-type", "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        for (Map.Entry entry2 : defaultRequest.f10288OooO0OO.entrySet()) {
            if (((String) entry2.getKey()).startsWith("x-amz-")) {
                treeMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str6 = (String) entry3.getKey();
            String str7 = (String) entry3.getValue();
            if (str6.startsWith("x-amz-")) {
                sb.append(str6);
                sb.append(':');
                if (str7 != null) {
                    sb.append(str7);
                }
            } else if (str7 != null) {
                sb.append(str7);
            }
            sb.append("\n");
        }
        sb.append(str2);
        String[] strArr = (String[]) defaultRequest.f10288OooO0OO.keySet().toArray(new String[defaultRequest.f10288OooO0OO.size()]);
        Arrays.sort(strArr);
        char c = '?';
        for (String str8 : strArr) {
            if (f10663OooO00o.contains(str8) || (collection != null && collection.contains(str8))) {
                if (sb.length() == 0) {
                    sb.append(c);
                }
                sb.append(str8);
                String str9 = (String) defaultRequest.f10288OooO0OO.get(str8);
                if (str9 != null) {
                    sb.append("=");
                    sb.append(str9);
                }
                c = Typography.amp;
            }
        }
        return sb.toString();
    }
}
