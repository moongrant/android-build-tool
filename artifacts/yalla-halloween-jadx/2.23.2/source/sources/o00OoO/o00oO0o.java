package o00OoO;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o<Data> implements o0OoOo0<Integer, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<Uri, Data> f37900OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f37901OooO0O0;

    public static final class OooO00o implements o00O0O<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37902OooO00o;

        public OooO00o(Resources resources) {
            this.f37902OooO00o = resources;
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        public final o0OoOo0<Integer, AssetFileDescriptor> OooO0Oo(oo000o oo000oVar) {
            return new o00oO0o(this.f37902OooO00o, oo000oVar.OooO0OO(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class OooO0O0 implements o00O0O<Integer, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37903OooO00o;

        public OooO0O0(Resources resources) {
            this.f37903OooO00o = resources;
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Integer, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new o00oO0o(this.f37903OooO00o, oo000oVar.OooO0OO(Uri.class, InputStream.class));
        }
    }

    public static class OooO0OO implements o00O0O<Integer, Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Resources f37904OooO00o;

        public OooO0OO(Resources resources) {
            this.f37904OooO00o = resources;
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Integer, Uri> OooO0Oo(oo000o oo000oVar) {
            return new o00oO0o(this.f37904OooO00o, o0OO00O.f37907OooO00o);
        }
    }

    public o00oO0o(Resources resources, o0OoOo0<Uri, Data> o0oooo1) {
        this.f37901OooO0O0 = resources;
        this.f37900OooO00o = o0oooo1;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull Integer num) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Integer num, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        Uri uri;
        Integer num2 = num;
        Resources resources = this.f37901OooO0O0;
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
        return this.f37900OooO00o.OooO0O0(uri, i, i2, oo0o0oo);
    }
}
