package p038OoooOo0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o<T> extends o000<T> {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final T[] f3716Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(@NotNull T[] buffer, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f3716Oooo0oo = buffer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f3716Oooo0oo;
        int i = this.f3688Oooo0o;
        this.f3688Oooo0o = i + 1;
        return tArr[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        T[] tArr = this.f3716Oooo0oo;
        int i = this.f3688Oooo0o - 1;
        this.f3688Oooo0o = i;
        return tArr[i];
    }
}
