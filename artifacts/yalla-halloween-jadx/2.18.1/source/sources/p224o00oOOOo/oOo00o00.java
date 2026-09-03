package p224o00oOOOo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p214o00oO0.o00OOO00;
import p214o00oO0.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class oOo00o00 implements o00OOOO0<BitmapDrawable>, o00OOO00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Resources f33848Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00OOOO0<Bitmap> f33849Oooo0oO;

    public oOo00o00(@NonNull Resources resources, @NonNull o00OOOO0<Bitmap> o00oooo1) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f33848Oooo0o = resources;
        Objects.requireNonNull(o00oooo1, "Argument must not be null");
        this.f33849Oooo0oO = o00oooo1;
    }

    @Nullable
    public static o00OOOO0<BitmapDrawable> OooO0O0(@NonNull Resources resources, @Nullable o00OOOO0<Bitmap> o00oooo1) {
        if (o00oooo1 == null) {
            return null;
        }
        return new oOo00o00(resources, o00oooo1);
    }

    @Override // p214o00oO0.o00OOOO0
    public final void OooO00o() {
        this.f33849Oooo0oO.OooO00o();
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<BitmapDrawable> OooO0OO() {
        return BitmapDrawable.class;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f33848Oooo0o, this.f33849Oooo0oO.get());
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        return this.f33849Oooo0oO.getSize();
    }

    @Override // p214o00oO0.o00OOO00
    public final void initialize() {
        o00OOOO0<Bitmap> o00oooo1 = this.f33849Oooo0oO;
        if (o00oooo1 instanceof o00OOO00) {
            ((o00OOO00) o00oooo1).initialize();
        }
    }
}
