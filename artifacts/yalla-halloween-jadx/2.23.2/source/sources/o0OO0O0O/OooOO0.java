package o0OO0O0O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f42370OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Boolean> f42361OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Bitmap> f42362OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f42363OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final HashMap<String, TextPaint> f42364OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, StaticLayout> f42366OooO0o0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, BoringLayout> f42365OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function2<Canvas, Integer, Boolean>> f42367OooO0oO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final HashMap<String, int[]> f42368OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, OooO00o> f42360OooO = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> f42369OooOO0 = new HashMap<>();

    public final void OooO00o(@NotNull Bitmap bitmap, @NotNull String forKey) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f42362OooO0O0.put(forKey, bitmap);
    }

    public final void OooO0O0(@NotNull String text, @NotNull TextPaint textPaint, @NotNull String forKey) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f42370OooOO0O = true;
        this.f42363OooO0OO.put(forKey, text);
        this.f42364OooO0Oo.put(forKey, textPaint);
    }

    public final void OooO0OO(@NotNull String forKey, boolean z) {
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f42361OooO00o.put(forKey, Boolean.valueOf(z));
    }
}
