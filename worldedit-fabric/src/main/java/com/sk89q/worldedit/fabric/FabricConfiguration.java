/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
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

package com.sk89q.worldedit.fabric;

import com.sk89q.worldedit.util.PropertiesConfiguration;

import java.io.File;

public class FabricConfiguration extends PropertiesConfiguration {

    public boolean creativeEnable = false;
    public boolean cheatMode = false;

    public FabricConfiguration(FabricWorldEdit mod) {
        super(new File(mod.getWorkingDir(), "worldedit.properties"));
    }

    @Override
    protected void loadExtra() {
        creativeEnable = getBool("use-in-creative", false);
        cheatMode = getBool("cheat-mode", false);
    }

    @Override
    public File getWorkingDirectory() {
        return FabricWorldEdit.inst.getWorkingDir();
    }
}
