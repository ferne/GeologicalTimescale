/*
 * Copyright (C) 2018 Timo Engel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.tengel.timescale;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Spanned;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.text.method.LinkMovementMethod;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.ScrollView;

public class InfoDialog
{
    public static void show(Activity activity, String title, String message)
    {
        WebView wv = new WebView(activity);
        wv.loadData(message, "text/html; charset=utf-8", null);

        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        if (title != null)
        {
            builder.setTitle(title);
        }
        builder.setView(wv);
        builder.setPositiveButton(R.string.ok, null);
        builder.create().show();
    }
}
