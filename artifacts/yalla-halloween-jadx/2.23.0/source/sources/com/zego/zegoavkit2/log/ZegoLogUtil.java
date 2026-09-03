package com.zego.zegoavkit2.log;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ZegoLogUtil {
    public static void createIfNotExist(Context context, String str, String str2) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = "application/octet-stream";
        }
        try {
            Uri uri = Uri.parse(str);
            File file = new File(DocumentsContract.getDocumentId(uri));
            String parent = file.getParent();
            String name = file.getName();
            Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, parent);
            if (find(context, uriBuildDocumentUriUsingTree, name) != null) {
                return;
            }
            DocumentsContract.createDocument(context.getContentResolver(), uriBuildDocumentUriUsingTree, str2, name);
        } catch (Exception unused) {
        }
    }

    public static void delete(Context context, String str) {
        try {
            Uri uri = Uri.parse(str);
            File file = new File(DocumentsContract.getDocumentId(uri));
            String parent = file.getParent();
            if (find(context, DocumentsContract.buildDocumentUriUsingTree(uri, parent), file.getName()) == null) {
                return;
            }
            DocumentsContract.deleteDocument(context.getContentResolver(), uri);
        } catch (Exception unused) {
        }
    }

    public static Uri find(Context context, Uri uri, String str) {
        Cursor cursorQuery = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri)), new String[]{"document_id", "_display_name"}, null, null, null);
        Uri uriBuildDocumentUriUsingTree = null;
        if (cursorQuery == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            if (cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")).equalsIgnoreCase(str)) {
                uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(cursorQuery.getColumnIndex("document_id")));
                break;
            }
        }
        cursorQuery.close();
        return uriBuildDocumentUriUsingTree;
    }

    public static int getFD(Context context, String str, String str2) {
        try {
            return context.getContentResolver().openFileDescriptor(Uri.parse(str), str2).detachFd();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long getFileSize(Context context, Uri uri, String str) {
        Cursor cursorQuery = context.getContentResolver().query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri)), new String[]{"_size", "_display_name"}, null, null, null);
        long j = 0;
        if (cursorQuery == null) {
            return 0L;
        }
        while (cursorQuery.moveToNext()) {
            if (cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")).equalsIgnoreCase(str)) {
                j = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                break;
            }
        }
        cursorQuery.close();
        return j;
    }

    public static String withAppendedPath(String str, String str2) {
        try {
            Uri uri = Uri.parse(str);
            return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getDocumentId(uri) + "/" + str2).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static long getFileSize(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        try {
            Uri uri = Uri.parse(str);
            File file = new File(DocumentsContract.getDocumentId(uri));
            String parent = file.getParent();
            return getFileSize(context, DocumentsContract.buildDocumentUriUsingTree(uri, parent), file.getName());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static long getFileSize(Context context, String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            return 0L;
        }
        return getFileSize(context, Uri.parse(str), str2);
    }
}
