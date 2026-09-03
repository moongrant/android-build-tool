package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.o0OOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfd {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15945OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f15946OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f15947OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0 f15948OooO0Oo;

    public zzfd(o0OOO0 o0ooo1, String str, Bundle bundle) {
        this.f15948OooO0Oo = o0ooo1;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.f15945OooO00o = "default_event_parameters";
        this.f15946OooO0O0 = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @WorkerThread
    public final Bundle zza() {
        byte b;
        if (this.f15947OooO0OO == null) {
            o0OOO0 o0ooo1 = this.f15948OooO0Oo;
            String string = o0ooo1.OooO0Oo().getString(this.f15945OooO00o, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
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
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b != 2) {
                                o0ooo1.f41276OooO00o.zzaA().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            o0ooo1.f41276OooO00o.zzaA().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f15947OooO0OO = bundle;
                } catch (JSONException unused2) {
                    o0O0OO0.OooO00o(o0ooo1.f41276OooO00o, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f15947OooO0OO == null) {
                this.f15947OooO0OO = this.f15946OooO0O0;
            }
        }
        return this.f15947OooO0OO;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        o0OOO0 o0ooo1 = this.f15948OooO0Oo;
        SharedPreferences.Editor editorEdit = o0ooo1.OooO0Oo().edit();
        int size = bundle.size();
        String str = this.f15945OooO00o;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            o0ooo1.f41276OooO00o.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        o0ooo1.f41276OooO00o.zzaA().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f15947OooO0OO = bundle;
    }
}
