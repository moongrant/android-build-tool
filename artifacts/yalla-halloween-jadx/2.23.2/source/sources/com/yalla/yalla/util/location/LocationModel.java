package com.yalla.yalla.util.location;

import android.location.Location;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/util/location/LocationModel;", "Ljava/io/Serializable;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class LocationModel implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Location f32317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f32318OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public String f32319OooO0o0;

    @NotNull
    public final String toString() {
        String strOooO00o = OooO.OooO00o(this);
        Location location = this.f32317OooO0Oo;
        double latitude = location != null ? location.getLatitude() : 0.0d;
        Location location2 = this.f32317OooO0Oo;
        return strOooO00o + ", \nlatitude = " + latitude + " , \nlongitude = " + (location2 != null ? location2.getLongitude() : 0.0d);
    }
}
