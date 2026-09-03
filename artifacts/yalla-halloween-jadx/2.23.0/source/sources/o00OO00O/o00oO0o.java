package o00OO00O;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o<Data> implements o0OoOo0<Integer, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<Uri, Data> f37138OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f37139OooO0O0;

    public static final class OooO00o implements o00O0O<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37140OooO00o;

        public OooO00o(Resources resources) {
            this.f37140OooO00o = resources;
        }

        @Override // o00OO00O.o00O0O
        public final o0OoOo0<Integer, AssetFileDescriptor> OooO0OO(oo000o oo000oVar) {
            return new o00oO0o(this.f37140OooO00o, oo000oVar.OooO0OO(Uri.class, AssetFileDescriptor.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0O0 implements o00O0O<Integer, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37141OooO00o;

        public OooO0O0(Resources resources) {
            this.f37141OooO00o = resources;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Integer, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o00oO0o(this.f37141OooO00o, oo000oVar.OooO0OO(Uri.class, InputStream.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0OO implements o00O0O<Integer, Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37142OooO00o;

        public OooO0OO(Resources resources) {
            this.f37142OooO00o = resources;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Integer, Uri> OooO0OO(oo000o oo000oVar) {
            return new o00oO0o(this.f37142OooO00o, o0OO00O.f37145OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o00oO0o(Resources resources, o0OoOo0<Uri, Data> o0oooo0) {
        this.f37139OooO0O0 = resources;
        this.f37138OooO00o = o0oooo0;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull Integer num) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Integer num, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f37139OooO0O0;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f37138OooO00o.OooO0O0(uri, i, i2, o00000Var);
    }
}
