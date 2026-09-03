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

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f14484OooOOO = new OooO00o(new String[0]);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    public final Bundle f14485OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    public final int f14486OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Bundle f14487OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getColumns", id = 1)
    public final String[] f14488OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWindows", id = 2)
    public final CursorWindow[] f14489OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    public final int f14490OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int[] f14491OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f14492OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14493OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f14494OooOOO0;

    public DataHolder(Builder builder, int i) {
        this(builder.f14495OooO00o, OooO0OO(builder), i, null);
    }

    public static CursorWindow[] OooO0OO(Builder builder) {
        if (builder.f14495OooO00o.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList<HashMap<String, Object>> arrayList = builder.f14496OooO0O0;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        String[] strArr = builder.f14495OooO00o;
        cursorWindow.setNumColumns(strArr.length);
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
                    cursorWindow.setNumColumns(strArr.length);
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
                    cursorWindow.setNumColumns(strArr.length);
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
        return new DataHolder(f14484OooOOO, i);
    }

    public final void OooO00o(int i, String str) {
        Bundle bundle = this.f14487OooO0o;
        if (bundle == null || !bundle.containsKey(str)) {
            String strValueOf = String.valueOf(str);
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "No such column: ".concat(strValueOf) : new String("No such column: "));
        }
        if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f14492OooOO0O) {
            throw new CursorIndexOutOfBoundsException(i, this.f14492OooOO0O);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f14493OooOO0o) {
                this.f14493OooOO0o = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f14489OooO0oO;
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
            if (this.f14494OooOOO0 && this.f14489OooO0oO.length > 0 && !isClosed()) {
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
        OooO00o(i, str);
        return Long.valueOf(this.f14489OooO0oO[i2].getLong(i, this.f14487OooO0o.getInt(str))).longValue() == 1;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getBlob(i, this.f14487OooO0o.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.f14492OooOO0O;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getInt(i, this.f14487OooO0o.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getLong(i, this.f14487OooO0o.getInt(str));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.f14485OooO;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.f14490OooO0oo;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getString(i, this.f14487OooO0o.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.f14492OooOO0O);
        while (true) {
            int[] iArr = this.f14491OooOO0;
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
        return this.f14487OooO0o.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].isNull(i, this.f14487OooO0o.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f14493OooOO0o;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.f14488OooO0o0, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f14489OooO0oO, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f14486OooO0Oo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getDouble(i, this.f14487OooO0o.getInt(str));
    }

    public final float zab(@NonNull String str, int i, int i2) {
        OooO00o(i, str);
        return this.f14489OooO0oO[i2].getFloat(i, this.f14487OooO0o.getInt(str));
    }

    public final void zac(@NonNull String str, int i, int i2, @NonNull CharArrayBuffer charArrayBuffer) {
        OooO00o(i, str);
        this.f14489OooO0oO[i2].copyStringToBuffer(i, this.f14487OooO0o.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.f14487OooO0o = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.f14488OooO0o0;
            if (i >= strArr.length) {
                break;
            }
            this.f14487OooO0o.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.f14489OooO0oO;
        this.f14491OooOO0 = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i2 = 0; i2 < cursorWindowArr.length; i2++) {
            this.f14491OooOO0[i2] = numRows;
            numRows += cursorWindowArr[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
        }
        this.f14492OooOO0O = numRows;
    }

    @KeepForSdk
    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f14495OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<HashMap<String, Object>> f14496OooO0O0 = new ArrayList<>();

        public /* synthetic */ Builder(String[] strArr) {
            this.f14495OooO00o = (String[]) Preconditions.checkNotNull(strArr);
            new HashMap();
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i);
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
            this.f14496OooO0O0.add(map);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i, @NonNull Bundle bundle) {
            return new DataHolder(this.f14495OooO00o, DataHolder.OooO0OO(this), i, bundle);
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f14493OooOO0o = false;
        this.f14494OooOOO0 = true;
        this.f14486OooO0Oo = i;
        this.f14488OooO0o0 = strArr;
        this.f14489OooO0oO = cursorWindowArr;
        this.f14490OooO0oo = i2;
        this.f14485OooO = bundle;
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
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.f14493OooOO0o = false;
        this.f14494OooOOO0 = true;
        this.f14486OooO0Oo = 1;
        this.f14488OooO0o0 = (String[]) Preconditions.checkNotNull(strArr);
        this.f14489OooO0oO = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.f14490OooO0oo = i;
        this.f14485OooO = bundle;
        zad();
    }
}
