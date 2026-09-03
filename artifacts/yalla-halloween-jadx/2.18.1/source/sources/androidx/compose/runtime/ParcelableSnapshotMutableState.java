package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o0O00OOO;
import p100o000oOoO.o0OO;
import p100o000oOoO.o0OO000;
import p100o000oOoO.o0OO0oO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lo000oOoO/o0OO0oO0;", "Landroid/os/Parcelable;", "runtime_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState<T> extends o0OO0oO0<T> implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new OooO00o();

    public static final class OooO00o implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        @Override // android.os.Parcelable.ClassLoaderCreator
        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableState<Object> createFromParcel(@NotNull Parcel parcel, @Nullable ClassLoader classLoader) {
            o0OO o0oo;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (classLoader == null) {
                classLoader = OooO00o.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                o0oo = o0O00OOO.f29537OooO00o;
            } else if (i == 1) {
                o0oo = o.f29323OooO00o;
            } else {
                if (i != 2) {
                    throw new IllegalStateException(OooO0O0.OooO00o.OooO00o("Unsupported MutableState policy ", i, " was restored"));
                }
                o0oo = o0OO000.f29595OooO00o;
            }
            return new ParcelableSnapshotMutableState<>(value, o0oo);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, @NotNull o0OO<T> policy) {
        super(t, policy);
        Intrinsics.checkNotNullParameter(policy, "policy");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(getValue());
        o0OO<T> o0oo = this.f29633Oooo0o;
        if (Intrinsics.areEqual(o0oo, o0O00OOO.f29537OooO00o)) {
            i2 = 0;
        } else if (Intrinsics.areEqual(o0oo, o.f29323OooO00o)) {
            i2 = 1;
        } else {
            if (!Intrinsics.areEqual(o0oo, o0OO000.f29595OooO00o)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
