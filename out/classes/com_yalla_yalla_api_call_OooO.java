package com.yalla.yalla.api.call;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f44948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f44949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f44950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public JSONObject f44951OooO0o0;

    public OooO(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f44947OooO00o = url;
        this.f44948OooO0O0 = i;
        this.f44949OooO0OO = new LinkedHashMap();
        this.f44950OooO0Oo = new LinkedHashMap();
    }

    @NotNull
    public final void OooO00o() {
        this.f44950OooO0Oo.put("Abnormal", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
    }

    @NotNull
    public final void OooO0O0() {
        this.f44950OooO0Oo.put("yl-rep", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
    }

    @NotNull
    public final void OooO0OO(@Nullable Object obj, @NotNull String key) throws JSONException {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            if (this.f44951OooO0o0 == null) {
                this.f44951OooO0o0 = new JSONObject();
            }
            JSONObject jSONObject = this.f44951OooO0o0;
            if (jSONObject != null) {
                jSONObject.put(key, obj);
            }
        }
    }

    @NotNull
    public final void OooO0Oo(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f44949OooO0OO.put(key, obj);
        }
    }

    @NotNull
    public final void OooO0o0() {
        this.f44950OooO0Oo.put("UnChangeDomain", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
    }
}
