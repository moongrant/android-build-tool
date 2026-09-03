package p221o00oOO;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p217o00oO00o.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00<Data> implements o00000O0<Integer, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<Uri, Data> f33706OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f33707OooO0O0;

    public static final class OooO00o implements o00000O<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f33708OooO00o;

        public OooO00o(Resources resources) {
            this.f33708OooO00o = resources;
        }

        @Override // p221o00oOO.o00000O
        public final o00000O0<Integer, AssetFileDescriptor> OooO00o(o0000 o0000Var) {
            return new o0000O00(this.f33708OooO00o, o0000Var.OooO0OO(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0O0 implements o00000O<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f33709OooO00o;

        public OooO0O0(Resources resources) {
            this.f33709OooO00o = resources;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Integer, ParcelFileDescriptor> OooO00o(o0000 o0000Var) {
            return new o0000O00(this.f33709OooO00o, o0000Var.OooO0OO(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0OO implements o00000O<Integer, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f33710OooO00o;

        public OooO0OO(Resources resources) {
            this.f33710OooO00o = resources;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Integer, InputStream> OooO00o(o0000 o0000Var) {
            return new o0000O00(this.f33710OooO00o, o0000Var.OooO0OO(Uri.class, InputStream.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0o implements o00000O<Integer, Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f33711OooO00o;

        public OooO0o(Resources resources) {
            this.f33711OooO00o = resources;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Integer, Uri> OooO00o(o0000 o0000Var) {
            return new o0000O00(this.f33711OooO00o, o0000O0O.f33712OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o0000O00(Resources resources, o00000O0<Uri, Data> o00000o1) {
        this.f33707OooO0O0 = resources;
        this.f33706OooO00o = o00000o1;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull Integer num) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull Integer num, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f33707OooO0O0.getResourcePackageName(num2.intValue()) + '/' + this.f33707OooO0O0.getResourceTypeName(num2.intValue()) + '/' + this.f33707OooO0O0.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f33706OooO00o.OooO0O0(uri, i, i2, o00000Var);
    }
}
