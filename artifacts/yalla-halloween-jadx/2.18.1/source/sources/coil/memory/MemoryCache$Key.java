package coil.memory;

import Oooo000.o00oO0o;
import android.os.Parcel;
import android.os.Parcelable;
import coil.size.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "Complex", "Simple", "Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key$Complex;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class MemoryCache$Key implements Parcelable {

    @Parcelize
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Complex;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Complex extends MemoryCache$Key {

        @NotNull
        public static final Parcelable.Creator<Complex> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f9866Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final String f9867Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final List<String> f9868Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public final Size f9869Oooo0oo;

        public static final class OooO00o implements Parcelable.Creator<Complex> {
            @Override // android.os.Parcelable.Creator
            public final Complex createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Size size = (Size) parcel.readParcelable(Complex.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new Complex(string, arrayListCreateStringArrayList, size, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Complex[] newArray(int i) {
                return new Complex[i];
            }
        }

        public Complex(@NotNull String base, @NotNull List<String> transformations, @Nullable Size size, @NotNull Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f9867Oooo0o = base;
            this.f9868Oooo0oO = transformations;
            this.f9869Oooo0oo = size;
            this.f9866Oooo = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Complex)) {
                return false;
            }
            Complex complex = (Complex) obj;
            return Intrinsics.areEqual(this.f9867Oooo0o, complex.f9867Oooo0o) && Intrinsics.areEqual(this.f9868Oooo0oO, complex.f9868Oooo0oO) && Intrinsics.areEqual(this.f9869Oooo0oo, complex.f9869Oooo0oo) && Intrinsics.areEqual(this.f9866Oooo, complex.f9866Oooo);
        }

        public final int hashCode() {
            int iHashCode = (this.f9868Oooo0oO.hashCode() + (this.f9867Oooo0o.hashCode() * 31)) * 31;
            Size size = this.f9869Oooo0oo;
            return this.f9866Oooo.hashCode() + ((iHashCode + (size == null ? 0 : size.hashCode())) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Complex(base=");
            sbOooO0o0.append(this.f9867Oooo0o);
            sbOooO0o0.append(", transformations=");
            sbOooO0o0.append(this.f9868Oooo0oO);
            sbOooO0o0.append(", size=");
            sbOooO0o0.append(this.f9869Oooo0oo);
            sbOooO0o0.append(", parameters=");
            sbOooO0o0.append(this.f9866Oooo);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f9867Oooo0o);
            out.writeStringList(this.f9868Oooo0oO);
            out.writeParcelable(this.f9869Oooo0oo, i);
            Map<String, String> map = this.f9866Oooo;
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
    }

    @Parcelize
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/memory/MemoryCache$Key$Simple;", "Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Simple extends MemoryCache$Key {

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final String f9870Oooo0o;

        public static final class OooO00o implements Parcelable.Creator<Simple> {
            @Override // android.os.Parcelable.Creator
            public final Simple createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Simple(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Simple[] newArray(int i) {
                return new Simple[i];
            }
        }

        public Simple(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f9870Oooo0o = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Simple) && Intrinsics.areEqual(this.f9870Oooo0o, ((Simple) obj).f9870Oooo0o);
        }

        public final int hashCode() {
            return this.f9870Oooo0o.hashCode();
        }

        @NotNull
        public final String toString() {
            return o00oO0o.OooO0O0(OooO00o.OooO00o.OooO0o0("Simple(value="), this.f9870Oooo0o, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f9870Oooo0o);
        }
    }
}
