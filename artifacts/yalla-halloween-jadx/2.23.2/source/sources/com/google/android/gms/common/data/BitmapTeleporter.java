package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new zaa();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public File f14470OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f14471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final int f14472OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @SafeParcelable.Field(id = 2)
    public ParcelFileDescriptor f14473OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Bitmap f14474OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f14475OooO0oo;

    @SafeParcelable.Constructor
    public BitmapTeleporter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 3) int i2) {
        this.f14471OooO0Oo = i;
        this.f14473OooO0o0 = parcelFileDescriptor;
        this.f14472OooO0o = i2;
        this.f14474OooO0oO = null;
        this.f14475OooO0oo = false;
    }

    public static final void OooO00o(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    @Nullable
    @KeepForSdk
    public Bitmap get() {
        if (!this.f14475OooO0oo) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.f14473OooO0o0)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    Bitmap.Config configValueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    OooO00o(dataInputStream);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, configValueOf);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
                    this.f14474OooO0oO = bitmapCreateBitmap;
                    this.f14475OooO0oo = true;
                } catch (IOException e) {
                    throw new IllegalStateException("Could not read from parcel file descriptor", e);
                }
            } catch (Throwable th) {
                OooO00o(dataInputStream);
                throw th;
            }
        }
        return this.f14474OooO0oO;
    }

    @KeepForSdk
    public void release() {
        if (this.f14475OooO0oo) {
            return;
        }
        try {
            ((ParcelFileDescriptor) Preconditions.checkNotNull(this.f14473OooO0o0)).close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close PFD", e);
        }
    }

    @KeepForSdk
    public void setTempDir(@NonNull File file) {
        if (file == null) {
            throw new NullPointerException("Cannot set null temp directory");
        }
        this.f14470OooO = file;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.f14473OooO0o0 == null) {
            Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(this.f14474OooO0oO);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f14470OooO;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f14473OooO0o0 = ParcelFileDescriptor.open(fileCreateTempFile, SQLiteDatabase.CREATE_IF_NECESSARY);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            OooO00o(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        }
                    } catch (Throwable th) {
                        OooO00o(dataOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file", e2);
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f14471OooO0Oo);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f14473OooO0o0, i | 1, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f14472OooO0o);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.f14473OooO0o0 = null;
    }

    @KeepForSdk
    public BitmapTeleporter(@NonNull Bitmap bitmap) {
        this.f14471OooO0Oo = 1;
        this.f14473OooO0o0 = null;
        this.f14472OooO0o = 0;
        this.f14474OooO0oO = bitmap;
        this.f14475OooO0oo = true;
    }
}
