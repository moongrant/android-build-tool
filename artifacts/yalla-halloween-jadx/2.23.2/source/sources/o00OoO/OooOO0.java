package o00OoO;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;
import p173o00OooOO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0<DataT> implements o0OoOo0<Integer, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO<DataT> f37850OooO0O0;

    public interface OooO<DataT> {
        Class<DataT> OooO00o();

        void OooO0O0(DataT datat) throws IOException;

        Object OooO0o0(Resources resources, int i, @Nullable Resources.Theme theme);
    }

    public static final class OooO00o implements o00O0O<Integer, AssetFileDescriptor>, OooO<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37851OooO00o;

        public OooO00o(Context context) {
            this.f37851OooO00o = context;
        }

        @Override // o00OoO.OooOO0.OooO
        public final Class<AssetFileDescriptor> OooO00o() {
            return AssetFileDescriptor.class;
        }

        @Override // o00OoO.OooOO0.OooO
        public final void OooO0O0(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Integer, AssetFileDescriptor> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new OooOO0(this.f37851OooO00o, this);
        }

        @Override // o00OoO.OooOO0.OooO
        public final Object OooO0o0(Resources resources, int i, @Nullable Resources.Theme theme) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class OooO0O0 implements o00O0O<Integer, Drawable>, OooO<Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37852OooO00o;

        public OooO0O0(Context context) {
            this.f37852OooO00o = context;
        }

        @Override // o00OoO.OooOO0.OooO
        public final Class<Drawable> OooO00o() {
            return Drawable.class;
        }

        @Override // o00OoO.OooOO0.OooO
        public final /* bridge */ /* synthetic */ void OooO0O0(Drawable drawable) throws IOException {
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Integer, Drawable> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new OooOO0(this.f37852OooO00o, this);
        }

        @Override // o00OoO.OooOO0.OooO
        public final Object OooO0o0(Resources resources, int i, @Nullable Resources.Theme theme) {
            Context context = this.f37852OooO00o;
            return p163o00OoOo0.o0ooOOo.OooO00o(context, context, i, theme);
        }
    }

    public static final class OooO0OO implements o00O0O<Integer, InputStream>, OooO<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37853OooO00o;

        public OooO0OO(Context context) {
            this.f37853OooO00o = context;
        }

        @Override // o00OoO.OooOO0.OooO
        public final Class<InputStream> OooO00o() {
            return InputStream.class;
        }

        @Override // o00OoO.OooOO0.OooO
        public final void OooO0O0(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Integer, InputStream> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new OooOO0(this.f37853OooO00o, this);
        }

        @Override // o00OoO.OooOO0.OooO
        public final Object OooO0o0(Resources resources, int i, @Nullable Resources.Theme theme) {
            return resources.openRawResource(i);
        }
    }

    public static final class OooO0o<DataT> implements com.bumptech.glide.load.data.OooO0o<DataT> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Resources.Theme f37854OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO<DataT> f37855OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Resources f37856OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f37857OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public DataT f37858OooO0oo;

        public OooO0o(@Nullable Resources.Theme theme, Resources resources, OooO<DataT> oooO, int i) {
            this.f37854OooO0Oo = theme;
            this.f37856OooO0o0 = resources;
            this.f37855OooO0o = oooO;
            this.f37857OooO0oO = i;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<DataT> OooO00o() {
            return this.f37855OooO0o.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            DataT datat = this.f37858OooO0oo;
            if (datat != null) {
                try {
                    this.f37855OooO0o.OooO0O0(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super DataT> oooO00o) {
            try {
                ?? r4 = (DataT) this.f37855OooO0o.OooO0o0(this.f37856OooO0o0, this.f37857OooO0oO, this.f37854OooO0Oo);
                this.f37858OooO0oo = r4;
                oooO00o.OooO0o0(r4);
            } catch (Resources.NotFoundException e) {
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public OooOO0(Context context, OooO<DataT> oooO) {
        this.f37849OooO00o = context.getApplicationContext();
        this.f37850OooO0O0 = oooO;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull Integer num) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Integer num, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
        Integer num2 = num;
        Resources.Theme theme = (Resources.Theme) oo0o0oo.OooO0OO(p163o00OoOo0.o0OO00O.f38104OooO0O0);
        return new o0OoOo0.OooO00o(new oo00o(num2), new OooO0o(theme, theme != null ? theme.getResources() : this.f37849OooO00o.getResources(), this.f37850OooO0O0, num2.intValue()));
    }
}
