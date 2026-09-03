package coil.memory;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface MemoryCache {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key;", "Landroid/os/Parcelable;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
    public static final class Key implements Parcelable {

        @JvmField
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f8542OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f8543OooO0o0;

        public static final class OooO00o implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 < i; i2++) {
                    String string2 = parcel.readString();
                    Intrinsics.checkNotNull(string2);
                    String string3 = parcel.readString();
                    Intrinsics.checkNotNull(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.f8542OooO0Oo = str;
            this.f8543OooO0o0 = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (Intrinsics.areEqual(this.f8542OooO0Oo, key.f8542OooO0Oo) && Intrinsics.areEqual(this.f8543OooO0o0, key.f8543OooO0o0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f8543OooO0o0.hashCode() + (this.f8542OooO0Oo.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Key(key=" + this.f8542OooO0Oo + ", extras=" + this.f8543OooO0o0 + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.f8542OooO0Oo);
            Map<String, String> map = this.f8543OooO0o0;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Bitmap f8544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Map<String, Object> f8545OooO0O0;

        public OooO00o(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.f8544OooO00o = bitmap;
            this.f8545OooO0O0 = map;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                OooO00o oooO00o = (OooO00o) obj;
                if (Intrinsics.areEqual(this.f8544OooO00o, oooO00o.f8544OooO00o) && Intrinsics.areEqual(this.f8545OooO0O0, oooO00o.f8545OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f8545OooO0O0.hashCode() + (this.f8544OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Value(bitmap=" + this.f8544OooO00o + ", extras=" + this.f8545OooO0O0 + ')';
        }
    }

    void OooO00o(int i);

    @Nullable
    OooO00o OooO0O0(@NotNull Key key);

    void OooO0OO(@NotNull Key key, @NotNull OooO00o oooO00o);
}
