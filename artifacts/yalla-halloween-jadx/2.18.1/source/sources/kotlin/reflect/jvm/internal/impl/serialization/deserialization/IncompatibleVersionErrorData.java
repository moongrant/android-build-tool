package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;

    @NotNull
    private final ClassId classId;
    private final T expectedVersion;

    @NotNull
    private final String filePath;

    public IncompatibleVersionErrorData(T t, T t2, @NotNull String filePath, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.actualVersion = t;
        this.expectedVersion = t2;
        this.filePath = filePath;
        this.classId = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t = this.actualVersion;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.expectedVersion;
        return this.classId.hashCode() + o0O0O00.OooO00o(this.filePath, (iHashCode + (t2 != null ? t2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("IncompatibleVersionErrorData(actualVersion=");
        sbOooO0o0.append(this.actualVersion);
        sbOooO0o0.append(", expectedVersion=");
        sbOooO0o0.append(this.expectedVersion);
        sbOooO0o0.append(", filePath=");
        sbOooO0o0.append(this.filePath);
        sbOooO0o0.append(", classId=");
        sbOooO0o0.append(this.classId);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
