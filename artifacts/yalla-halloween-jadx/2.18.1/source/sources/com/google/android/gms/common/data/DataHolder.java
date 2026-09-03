package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final OooO00o f15463OoooOOO = new OooO00o(new String[0]);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    public final CursorWindow[] f15464Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    public final int f15465Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    public final String[] f15466Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Bundle f15467Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f15468OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    public final Bundle f15469OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    public final int f15470OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int[] f15471OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f15472OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f15473o000oOoO;

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f15472OoooOO0 = false;
        this.f15473o000oOoO = true;
        this.f15465Oooo0o = i;
        this.f15466Oooo0oO = strArr;
        this.f15464Oooo = cursorWindowArr;
        this.f15470OoooO00 = i2;
        this.f15469OoooO0 = bundle;
    }

    public static CursorWindow[] OooO0O0(Builder builder) {
        if (builder.f15474OooO00o.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList<HashMap<String, Object>> arrayList = builder.f15475OooO0O0;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.f15474OooO00o.length);
        int i = 0;
        boolean z = false;
        while (i < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(builder.f15474OooO00o.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                HashMap<String, Object> map = arrayList.get(i);
                int i2 = 0;
                boolean zPutDouble = true;
                while (true) {
                    String[] strArr = builder.f15474OooO00o;
                    if (i2 >= strArr.length) {
                        z = zPutDouble ? false : true;
                        i++;
                    } else if (zPutDouble) {
                        String str = strArr[i2];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i, i2);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i, i2);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i, i2);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i, i2);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i, i2);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i, i2);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i, i2);
                        } else {
                            if (!(obj instanceof Float)) {
                                String string = obj.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + string.length());
                                sb2.append("Unsupported object for column ");
                                sb2.append(str);
                                sb2.append(": ");
                                sb2.append(string);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i, i2);
                        }
                        i2++;
                    }
                    if (z) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i);
                    sb3.append(" - allocating new window.");
                    Log.d("DataHolder", sb3.toString());
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(builder.f15474OooO00o.length);
                    arrayList2.add(cursorWindow);
                    i--;
                    i++;
                }
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((CursorWindow) arrayList2.get(i3)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i) {
        OooO00o oooO00o = f15463OoooOOO;
        return new DataHolder(oooO00o.f15474OooO00o, OooO0O0(oooO00o), i, null);
    }

    public final void OooO00o(String str, int i) {
        Bundle bundle = this.f15467Oooo0oo;
        if (bundle == null || !bundle.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new String("No such column: "));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f15468OoooO) {
            throw new CursorIndexOutOfBoundsException(i, this.f15468OoooO);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f15472OoooOO0) {
                this.f15472OoooOO0 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f15464Oooo;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f15473o000oOoO && this.f15464Oooo.length > 0 && !isClosed()) {
                close();
                String string = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return Long.valueOf(this.f15464Oooo[i2].getLong(i, this.f15467Oooo0oo.getInt(str))).longValue() == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getBlob(i, this.f15467Oooo0oo.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.f15468OoooO;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getInt(i, this.f15467Oooo0oo.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getLong(i, this.f15467Oooo0oo.getInt(str));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.f15469OoooO0;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.f15470OoooO00;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getString(i, this.f15467Oooo0oo.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.f15468OoooO);
        while (true) {
            int[] iArr = this.f15471OoooO0O;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.f15467Oooo0oo.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].isNull(i, this.f15467Oooo0oo.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f15472OoooOO0;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f15466Oooo0oO, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f15464Oooo, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f15465Oooo0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getDouble(i, this.f15467Oooo0oo.getInt(str));
    }

    public final float zab(@NonNull String str, int i, int i2) {
        OooO00o(str, i);
        return this.f15464Oooo[i2].getFloat(i, this.f15467Oooo0oo.getInt(str));
    }

    public final void zac(@NonNull String str, int i, int i2, @NonNull CharArrayBuffer charArrayBuffer) {
        OooO00o(str, i);
        this.f15464Oooo[i2].copyStringToBuffer(i, this.f15467Oooo0oo.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.f15467Oooo0oo = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f15466Oooo0oO;
            if (i2 >= strArr.length) {
                break;
            }
            this.f15467Oooo0oo.putInt(strArr[i2], i2);
            i2++;
        }
        this.f15471OoooO0O = new int[this.f15464Oooo.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f15464Oooo;
            if (i >= cursorWindowArr.length) {
                this.f15468OoooO = numRows;
                return;
            }
            this.f15471OoooO0O[i] = numRows;
            numRows += this.f15464Oooo[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    @KeepForSdk
    public DataHolder(@NonNull Cursor cursor, int i, @Nullable Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    @KeepForSdk
    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f15474OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<HashMap<String, Object>> f15475OooO0O0 = new ArrayList<>();

        public /* synthetic */ Builder(String[] strArr) {
            this.f15474OooO00o = (String[]) Preconditions.checkNotNull(strArr);
            new HashMap();
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this.f15474OooO00o, DataHolder.OooO0O0(this), i, null);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap<String, Object> map = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap<String, Object> map) {
            Asserts.checkNotNull(map);
            this.f15475OooO0O0.add(map);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i, @NonNull Bundle bundle) {
            return new DataHolder(this.f15474OooO00o, DataHolder.OooO0O0(this), i, bundle);
        }
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.f15472OoooOO0 = false;
        this.f15473o000oOoO = true;
        this.f15465Oooo0o = 1;
        this.f15466Oooo0oO = (String[]) Preconditions.checkNotNull(strArr);
        this.f15464Oooo = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.f15470OoooO00 = i;
        this.f15469OoooO0 = bundle;
        zad();
    }
}
