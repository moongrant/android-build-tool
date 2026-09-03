package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OooOO0 implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SerializedName("indices")
    public final List<Integer> f21581OooO0Oo;

    public final int OooO00o() {
        return this.f21581OooO0Oo.get(1).intValue();
    }

    public final int OooO0O0() {
        return this.f21581OooO0Oo.get(0).intValue();
    }
}
