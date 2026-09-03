package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final UriMatcher f19732OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19733OooO00o;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f19732OooO0O0 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public OooO0o(Context context) {
        this.f19733OooO00o = context;
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        Uri uri = oooo0.f19769OooO0Oo;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f19732OooO0O0.match(oooo0.f19769OooO0Oo) != -1;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[PHI: r6
      0x0040: PHI (r6v5 android.net.Uri) = (r6v2 android.net.Uri), (r6v1 android.net.Uri) binds: [B:15:0x003c, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f19733OooO00o.getContentResolver();
        Uri uriLookupContact = oooo0.f19769OooO0Oo;
        int iMatch = f19732OooO0O0.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch == 3) {
                    inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
                } else if (iMatch != 4) {
                    throw new IllegalStateException("Invalid uri: " + uriLookupContact);
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
            return new o0OoOo0.OooO00o(inputStreamOpenContactPhotoInputStream, Picasso.LoadedFrom.DISK);
        }
        return null;
    }
}
