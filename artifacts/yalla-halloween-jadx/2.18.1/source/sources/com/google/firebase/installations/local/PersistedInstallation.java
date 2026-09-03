package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p351o0OOOOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class PersistedInstallation {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public File f19151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooOOO f19152OooO0O0;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull OooOOO oooOOO) {
        this.f19152OooO0O0 = oooOOO;
    }

    public final File OooO00o() {
        if (this.f19151OooO00o == null) {
            synchronized (this) {
                if (this.f19151OooO00o == null) {
                    OooOOO oooOOO = this.f19152OooO0O0;
                    oooOOO.OooO00o();
                    this.f19151OooO00o = new File(oooOOO.f38263OooO00o.getFilesDir(), "PersistedInstallation." + this.f19152OooO0O0.OooO0Oo() + ".json");
                }
            }
        }
        return this.f19151OooO00o;
    }

    @NonNull
    public final OooO0O0 OooO0O0(@NonNull OooO0O0 oooO0O0) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", oooO0O0.OooO0OO());
            jSONObject.put("Status", oooO0O0.OooO0o().ordinal());
            jSONObject.put("AuthToken", oooO0O0.OooO00o());
            jSONObject.put("RefreshToken", oooO0O0.OooO0o0());
            jSONObject.put("TokenCreationEpochInSecs", oooO0O0.OooO0oO());
            jSONObject.put("ExpiresInSecs", oooO0O0.OooO0O0());
            jSONObject.put("FisError", oooO0O0.OooO0Oo());
            OooOOO oooOOO = this.f19152OooO0O0;
            oooOOO.OooO00o();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", oooOOO.f38263OooO00o.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(OooO00o())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return oooO0O0;
    }

    @NonNull
    public final OooO0O0 OooO0OO() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(OooO00o());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", registrationStatus.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = OooO0O0.f19150OooO00o;
        OooO00o.C0152OooO00o c0152OooO00o = new OooO00o.C0152OooO00o();
        c0152OooO00o.OooO0Oo(0L);
        c0152OooO00o.f19144OooO0O0 = registrationStatus;
        c0152OooO00o.OooO0O0(0L);
        c0152OooO00o.f19143OooO00o = strOptString;
        c0152OooO00o.OooO0OO(RegistrationStatus.values()[iOptInt]);
        c0152OooO00o.f19145OooO0OO = strOptString2;
        c0152OooO00o.f19146OooO0Oo = strOptString3;
        c0152OooO00o.OooO0Oo(jOptLong);
        c0152OooO00o.OooO0O0(jOptLong2);
        c0152OooO00o.f19149OooO0oO = strOptString4;
        return c0152OooO00o.OooO00o();
    }
}
