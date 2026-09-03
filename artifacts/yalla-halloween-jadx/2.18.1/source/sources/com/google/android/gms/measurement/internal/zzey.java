package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.umeng.analytics.pro.ak;
import o0OO0OoO.o0O0O00;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p167o00Ooo.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzey {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f16150OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f16151OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f16152OooO0Oo;

    public zzey(o0O0O00 o0o0o00, String str, Bundle bundle) {
        this.f16152OooO0Oo = o0o0o00;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.f16149OooO00o = "default_event_parameters";
        this.f16150OooO0O0 = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    @WorkerThread
    public final Bundle zza() {
        byte b;
        if (this.f16151OooO0OO == null) {
            String string = this.f16152OooO0Oo.OooO0o0().getString(this.f16149OooO00o, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString(ak.aH);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals(ak.aB)) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (string3.equals("d")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                bundle.putString(string2, jSONObject.getString(ak.aE));
                            } else if (b == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(ak.aE)));
                            } else if (b != 2) {
                                this.f16152OooO0Oo.f37615OooO00o.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString(ak.aE)));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f16152OooO0Oo.f37615OooO00o.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f16151OooO0OO = bundle;
                } catch (JSONException unused2) {
                    OooOO0.OooO0O0(this.f16152OooO0Oo.f37615OooO00o, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f16151OooO0OO == null) {
                this.f16151OooO0OO = this.f16150OooO0O0;
            }
        }
        return this.f16151OooO0OO;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.f16152OooO0Oo.OooO0o0().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f16149OooO00o);
        } else {
            String str = this.f16149OooO00o;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put(ak.aE, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(ak.aH, ak.aB);
                        } else if (obj instanceof Long) {
                            jSONObject.put(ak.aH, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(ak.aH, "d");
                        } else {
                            this.f16152OooO0Oo.f37615OooO00o.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f16152OooO0Oo.f37615OooO00o.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f16151OooO0OO = bundle;
    }
}
