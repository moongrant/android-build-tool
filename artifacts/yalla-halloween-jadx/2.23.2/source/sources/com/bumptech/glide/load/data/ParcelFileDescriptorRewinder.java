package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelFileDescriptorRewinder implements OooO<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InternalRewinder f13060OooO00o;

    @RequiresApi(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ParcelFileDescriptor f13061OooO00o;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f13061OooO00o = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            ParcelFileDescriptor parcelFileDescriptor = this.f13061OooO00o;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    @RequiresApi(21)
    public static final class OooO00o implements OooO.OooO00o<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<ParcelFileDescriptor> OooO00o() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<ParcelFileDescriptor> build(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f13060OooO00o = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.OooO
    public final void OooO0O0() {
    }

    @Override // com.bumptech.glide.load.data.OooO
    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor OooO00o() throws IOException {
        return this.f13060OooO00o.rewind();
    }
}
