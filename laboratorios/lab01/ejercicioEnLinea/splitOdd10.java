public boolean splitOdd10(int[] nums) {
return help(nums, 0, 0, 0);
}

public boolean help(int[] nums, int m10, int odd, int ind)
{
if(nums.length == ind)
{
return (m10 %10 == 0 && odd%2 != 0);
}
return help(nums, m10+nums[ind], odd, ind+1) || help(nums, m10, odd+nums[ind], ind+1);
}