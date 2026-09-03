package o0OO0O0;

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

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f43080OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Boolean> f43071OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Bitmap> f43072OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f43073OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final HashMap<String, TextPaint> f43074OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, StaticLayout> f43076OooO0o0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, BoringLayout> f43075OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function2<Canvas, Integer, Boolean>> f43077OooO0oO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final HashMap<String, int[]> f43078OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final HashMap<String, OooO00o> f43070OooO = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> f43079OooOO0 = new HashMap<>();

    public final void OooO00o(@NotNull Bitmap bitmap, @NotNull String forKey) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f43072OooO0O0.put(forKey, bitmap);
    }

    public final void OooO0O0(@NotNull String text, @NotNull TextPaint textPaint, @NotNull String forKey) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f43080OooOO0O = true;
        this.f43073OooO0OO.put(forKey, text);
        this.f43074OooO0Oo.put(forKey, textPaint);
    }

    public final void OooO0OO(@NotNull String forKey, boolean z) {
        Intrinsics.checkNotNullParameter(forKey, "forKey");
        this.f43071OooO00o.put(forKey, Boolean.valueOf(z));
    }
}
