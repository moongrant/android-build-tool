package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.appcompat.widget.o0000O0O;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final UriMatcher f21245OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21246OooO00o;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f21245OooO0O0 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public OooOO0(Context context) {
        this.f21246OooO00o = context;
    }

    @Override // com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        Uri uri = o00ooo2.f21321OooO0Oo;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f21245OooO0O0.match(o00ooo2.f21321OooO0Oo) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[PHI: r6
      0x0035: PHI (r6v5 android.net.Uri) = (r6v2 android.net.Uri), (r6v1 android.net.Uri) binds: [B:15:0x0031, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f21246OooO00o.getContentResolver();
        Uri uriLookupContact = o00ooo2.f21321OooO0Oo;
        int iMatch = f21245OooO0O0.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch == 3) {
                    inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
                } else if (iMatch != 4) {
                    throw new IllegalStateException(o0000O0O.OooO00o("Invalid uri: ", uriLookupContact));
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            if (uriLookupContact == null) {
                inputStreamOpenContactPhotoInputStream = null;
            } else {
                inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
            }
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return new o00oO0o.OooO00o(inputStreamOpenContactPhotoInputStream, Picasso.LoadedFrom.DISK);
        }
        return null;
    }
}
