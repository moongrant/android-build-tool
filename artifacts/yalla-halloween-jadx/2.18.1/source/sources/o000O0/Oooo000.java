package o000O0;

import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.umeng.commonsdk.config.d;
import java.util.Objects;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f28075OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f28076OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f28077OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f28078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f28079OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public Oooo000(@NonNull Uri uri, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = 1, to = d.a) int i2, boolean z, int i3) {
        Objects.requireNonNull(uri);
        this.f28075OooO00o = uri;
        this.f28076OooO0O0 = i;
        this.f28077OooO0OO = i2;
        this.f28078OooO0Oo = z;
        this.f28079OooO0o0 = i3;
    }
}
