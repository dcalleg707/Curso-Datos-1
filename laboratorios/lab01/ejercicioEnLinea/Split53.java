
public boolean split53(int[] nums) {
return help(nums, 0, 0, 0);
}

public boolean help(int[] nums, int g1, int g2, int ind)
{
if(nums.length == ind)
{
return (g1 == g2);
}
if(nums[ind] % 5 == 0)
{
return help(nums, g1+nums[ind], g2, ind+1);
}
else if(nums[ind] % 3 == 0)
{
return help(nums, g1, g2 + nums[ind], ind+1);
}
return help(nums, g1 +nums[ind], g2, ind+1) || help(nums, g1, g2+nums[ind], ind+1);
}