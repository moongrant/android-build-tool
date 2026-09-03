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
public final class cl extends cc {
    public cl(Runnable runnable) {
        super("huawei", runnable);
    }

    @Override // com.appsflyer.internal.cj
    public final void AFInAppEventType(Context context) {
        AFKeystoreWrapper(context, new at<Map<String, Object>>(context, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.cl.1
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code duplicated, block: B:22:0x010e A[PHI: r2
              0x010e: PHI (r2v6 android.database.Cursor) = (r2v5 android.database.Cursor), (r2v7 android.database.Cursor) binds: [B:21:0x010c, B:15:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // com.appsflyer.internal.at
            /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String str = ((PackageItemInfo) this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFInAppEventType, 128)).packageName;
                cl.this.AFInAppEventParameterName.put("api_ver", Long.valueOf(aa.valueOf(this.AFInAppEventParameterName, str)));
                cl.this.AFInAppEventParameterName.put("api_ver_name", aa.AFInAppEventParameterName(this.AFInAppEventParameterName, str));
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFInAppEventParameterName.getContentResolver();
                        StringBuilder sb = new StringBuilder("content://");
                        sb.append(this.AFInAppEventType);
                        sb.append("/item/5");
                        cursorQuery = contentResolver.query(Uri.parse(sb.toString()), null, null, new String[]{this.AFInAppEventParameterName.getPackageName()}, null);
                        if (cursorQuery == null) {
                            cl.this.AFInAppEventParameterName.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            cl.this.AFInAppEventParameterName.put("response", "OK");
                            cl.this.AFInAppEventParameterName.put("referrer", cursorQuery.getString(0));
                            cl.this.AFInAppEventParameterName.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                            cl.this.AFInAppEventParameterName.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                            if (cursorQuery.getColumnCount() > 3) {
                                cl.this.AFInAppEventParameterName.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                                HashMap map = new HashMap();
                                String string = cursorQuery.getString(4);
                                if (string != null) {
                                    map.put("track_id", string);
                                }
                                map.put("referrer_ex", cursorQuery.getString(5));
                                cl.this.AFInAppEventParameterName.put("huawei_custom", map);
                            }
                        } else {
                            cl.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        cl.this.AFInAppEventParameterName.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.AFKeystoreWrapper(e.getMessage(), e);
                        if (0 != 0) {
                            cursorQuery.close();
                        }
                    }
                    cl.this.AFKeystoreWrapper();
                    return cl.this.AFInAppEventParameterName;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        });
    }
}
