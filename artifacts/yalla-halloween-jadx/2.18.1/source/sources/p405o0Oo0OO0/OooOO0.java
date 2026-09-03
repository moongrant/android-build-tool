package p405o0Oo0OO0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f39051OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public HashMap<String, Boolean> f39044OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public HashMap<String, Bitmap> f39045OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public HashMap<String, String> f39046OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public HashMap<String, TextPaint> f39047OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public HashMap<String, StaticLayout> f39049OooO0o0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public HashMap<String, Function2<Canvas, Integer, Boolean>> f39048OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public HashMap<String, Function4<Canvas, Integer, Integer, Integer, Boolean>> f39050OooO0oO = new HashMap<>();

    public final void OooO00o(@NotNull Bitmap bitmap, @NotNull String str) {
        this.f39045OooO0O0.put(str, bitmap);
    }

    public final void OooO0O0(@NotNull String str, @NotNull TextPaint textPaint, @NotNull String str2) {
        this.f39051OooO0oo = true;
        this.f39046OooO0OO.put(str2, str);
        this.f39047OooO0Oo.put(str2, textPaint);
    }

    public final void OooO0OO(boolean z, @NotNull String str) {
        this.f39044OooO00o.put(str, Boolean.valueOf(z));
    }
}
