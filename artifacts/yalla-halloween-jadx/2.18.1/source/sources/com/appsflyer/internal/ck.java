package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ck extends cc {
    public ck(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.cj
    public final void AFInAppEventType(Context context) {
        AFKeystoreWrapper(context, new at<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.ck.5
            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:24:0x00d3 A[PHI: r2
              0x00d3: PHI (r2v1 android.database.Cursor) = (r2v0 android.database.Cursor), (r2v8 android.database.Cursor) binds: [B:23:0x00d1, B:17:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.appsflyer.internal.at
            /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.AFInAppEventType);
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            ck.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            ck.this.AFInAppEventParameterName.put("response", "OK");
                            AFInAppEventType("referrer", ck.this.AFInAppEventParameterName, cursorQuery);
                            AFKeystoreWrapper("click_ts", ck.this.AFInAppEventParameterName, cursorQuery);
                            AFKeystoreWrapper("install_begin_ts", ck.this.AFInAppEventParameterName, cursorQuery);
                            AFKeystoreWrapper("install_end_ts", ck.this.AFInAppEventParameterName, cursorQuery);
                            AFInAppEventType("organic_keywords", ck.this.AFInAppEventParameterName, cursorQuery);
                            AFInAppEventType("attr_type", ck.this.AFInAppEventParameterName, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFKeystoreWrapper("click_server_ts", map, cursorQuery);
                            AFKeystoreWrapper("install_begin_server_ts", map, cursorQuery);
                            AFInAppEventType("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                ck.this.AFInAppEventParameterName.put("custom", map);
                            }
                        } else {
                            ck.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        ck.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.AFKeystoreWrapper(e.getMessage(), e);
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                    String str = ((PackageItemInfo) this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128)).packageName;
                    ck.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(aa.valueOf(this.AFInAppEventParameterName, str)));
                    ck.this.AFInAppEventParameterName.put("api_ver_name", aa.AFInAppEventParameterName(this.AFInAppEventParameterName, str));
                    ck.this.AFKeystoreWrapper();
                    return ck.this.AFInAppEventParameterName;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }
        });
    }
}
